package mikufan.cx.vocadbapiclientfixer.component

import mu.KotlinLogging
import org.jeasy.batch.core.mapper.RecordMapper
import org.jeasy.batch.core.record.GenericRecord
import org.jeasy.batch.core.record.Record
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.useLines

/**
 * @date 2021-05-19
 * @author CX无敌
 */
@Component
class ApiApiContentFixer : RecordMapper<Path, Pair<Path, String>> {
  override fun processRecord(record: Record<Path>): Record<Pair<Path, String>>? {
    val path = record.payload
    var processed = false
    val fixedContent = path.useLines { seq ->
      seq.map {
        if (it.contains("ApiApi")) {
          processed = true
          it.replace("ApiApi", "Api")
        } else {
          it
        }
      }.joinToString("\n")
    }
    return if (processed){
      log.debug { "Found \"ApiApi\" in $path" }
      GenericRecord(record.header, Pair(path, fixedContent))
    } else {
      null
    }
  }
}

private val log = KotlinLogging.logger {}