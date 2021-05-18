package mikufan.cx.vocadbapiclientfixer.service

import mikufan.cx.vocadbapiclientfixer.component.EnumClassExtractor
import mikufan.cx.vocadbapiclientfixer.component.EnumClassFilter
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
  val enumClassExtractor: EnumClassExtractor
) : Runnable {

  override fun run() {
    val fixJob = JobBuilder<Path, FixInfo>()
      .named("Enum class fixing Job")
      .reader(modelsReader)
      .filter(enumClassFilter)
      .mapper(enumClassExtractor)
      .writer {}
      .build()

    JobExecutor().use { executor ->
      val jobReport = executor.execute(fixJob)
      log.info { "\n$jobReport" }
    }

  }

}

private val log = KotlinLogging.logger {}