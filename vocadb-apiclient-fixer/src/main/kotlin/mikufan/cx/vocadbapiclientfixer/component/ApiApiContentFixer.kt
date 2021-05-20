package mikufan.cx.vocadbapiclientfixer.component

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging
import org.jeasy.batch.core.record.Batch
import org.jeasy.batch.core.writer.RecordWriter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.useLines
import kotlin.io.path.writeText
import kotlin.system.measureTimeMillis

/**
 * @date 2021-05-19
 * @author CX无敌
 */
@Component
class ApiApiContentFixer(
  @Value("\${config.dry-run}") val dryRun: Boolean
) : RecordWriter<Path> {

  override fun writeRecords(batch: Batch<Path>): Unit {
    val timeMillis = measureTimeMillis {
      runBlocking(Dispatchers.IO) {
        batch.map { it.payload }
          .forEach {
            launch {
              doFix(it)
            }
          }
      }
    }
    log.info { "Writing cost $timeMillis ms" }
  }

  private suspend fun doFix(path: Path) {
    var found = false
    val fixedContent = path.useLines { seq ->
      seq.map {
        if (it.contains("ApiApi")) {
          found = true
          it.replace("ApiApi", "Api")
        } else {
          it
        }
      }.joinToString("\n")
    }
    if (found) {
      log.debug { "Found \"ApiApi\" in $path" }
      if (dryRun){
        log.debug { "Dry Run writing to $path:\n$fixedContent" }
      } else {
        log.debug { "Fixing $path" }
        path.writeText(fixedContent)
      }
    }
  }
}

private val log = KotlinLogging.logger {}