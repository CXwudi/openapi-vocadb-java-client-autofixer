package mikufan.cx.vocadbapiclientfixer.component

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mikufan.cx.vocadbapiclientfixer.model.FixInfo
import mu.KotlinLogging
import org.jeasy.batch.core.record.Batch
import org.jeasy.batch.core.writer.RecordWriter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.io.IOException
import java.nio.file.Paths
import java.text.MessageFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.io.path.useLines
import kotlin.io.path.writeText
import kotlin.system.measureTimeMillis

/**
 * @date 2021-05-18
 * @author CX无敌
 */
@Component
class EnumClassFixer(
  @Value("\${config.multi-enums-class-template}") templateResource: String,
  @Value("\${config.dry-run}") val dryRun: Boolean
): RecordWriter<FixInfo> {

  val template by lazy {
    val url = this::class.java.classLoader.getResource(templateResource)
      ?: throw IOException("Can not find template for fixing enum classes")

    Paths.get(url.toURI()).useLines {
      it.joinToString("\n")
    }.also { log.info { "Successfully load java template" } }
  }

  override fun writeRecords(batch: Batch<FixInfo>) {
    val timeMillis = measureTimeMillis {
      runBlocking(Dispatchers.IO) {
        batch.map { it.payload }
          .forEach { fixInfo ->
            launch {
              writeFix(fixInfo)
            }
          }
      }
    }
    log.info { "Fixed in $timeMillis ms" }
  }

  private suspend fun writeFix(fixInfo: FixInfo) {
    val enumString = fixInfo.enums.joinToString(",\n\n    ")
    val newClassContent = MessageFormat.format(
      template,
      fixInfo.`package`,
      fixInfo.className,
      enumString,
      LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    )
    if (dryRun) {
      log.info { "Dry Run writing to ${fixInfo.originalClassFile}:\n$newClassContent" }
    } else {
      log.debug { "Writing fix to ${fixInfo.originalClassFile}" }
      fixInfo.originalClassFile.writeText(newClassContent)
    }
  }
}

private val log = KotlinLogging.logger {}