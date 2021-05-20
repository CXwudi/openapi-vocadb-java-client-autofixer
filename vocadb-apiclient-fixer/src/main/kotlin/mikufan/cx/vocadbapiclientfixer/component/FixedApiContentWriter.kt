package mikufan.cx.vocadbapiclientfixer.component

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging
import org.jeasy.batch.core.record.Batch
import org.jeasy.batch.core.writer.RecordWriter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.writeText

/**
 * @date 2021-05-19
 * @author CX无敌
 */
@Component
class FixedApiContentWriter(
  @Value("\${config.dry-run}") val dryRun: Boolean
): RecordWriter<Pair<Path, String>> {
  override fun writeRecords(batch: Batch<Pair<Path, String>>) {
    runBlocking {
      batch.map { it.payload }
        .forEach {
          launch {
            val path = it.first
            val content = it.second
            if (dryRun){
              log.debug { "Dry Run writing to $path:\n$content" }
            } else {
              log.debug { "Fixing $path" }
              path.writeText(content)
            }
          }
        }
    }
  }
}

private val log = KotlinLogging.logger {}