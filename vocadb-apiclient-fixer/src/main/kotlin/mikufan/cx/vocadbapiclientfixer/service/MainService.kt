package mikufan.cx.vocadbapiclientfixer.service

import mikufan.cx.vocadbapiclientfixer.component.*
import mikufan.cx.vocadbapiclientfixer.model.FixInfo
import mu.KotlinLogging
import org.jeasy.batch.core.job.JobBuilder
import org.jeasy.batch.core.job.JobExecutor
import org.jeasy.batch.core.reader.FileRecordReader
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import java.nio.file.Path

/**
 * @date 2021-05-17
 * @author CX无敌
 */
@Service
class MainService(
  @Qualifier("modelReader") val modelsReader: FileRecordReader,
  val enumClassFilter: EnumClassFilter,
  val enumClassExtractor: EnumClassExtractor,
  val enumClassFixer: EnumClassFixer,
  @Qualifier("projectReader") val projectReader: FileRecordReader,
  val apiApiFilesFilter: ApiApiFilesFilter,
  val apiApiFileRenamer: ApiApiFileRenamer,
  val apiApiContentFixer: ApiApiContentFixer
) : Runnable {

  override fun run() {
    val fixJob = JobBuilder<Path, FixInfo>()
      .named("Enum class fixing Job")
      .reader(modelsReader)
      .filter(enumClassFilter)
      .mapper(enumClassExtractor)
      .writer(enumClassFixer)
      .build()

    val apiRenameJob = JobBuilder<Path, Path>()
      .named("ApiApi replacing job")
      .reader(projectReader)
      .filter(apiApiFilesFilter)
      .mapper(apiApiFileRenamer)
      .writer(apiApiContentFixer)
      .build()

    JobExecutor().use { executor ->
      val jobReport = executor.execute(fixJob)
      log.info { "\n$jobReport" }
      val jobReport2 = executor.execute(apiRenameJob)
      log.info { "$jobReport2" }
    }

  }

}

private val log = KotlinLogging.logger {}