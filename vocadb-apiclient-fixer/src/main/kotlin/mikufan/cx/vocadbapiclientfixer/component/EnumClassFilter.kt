package mikufan.cx.vocadbapiclientfixer.component

import mu.KotlinLogging
import org.jeasy.batch.core.filter.RecordFilter
import org.jeasy.batch.core.record.Record
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.name

/**
 * find all target enum classes
 * @date 2021-05-17
 * @author CX无敌
 */
@Component
class EnumClassFilter: RecordFilter<Path> {

  override fun processRecord(record: Record<Path>): Record<Path>? {
    val path = record.payload
    val fileName = path.fileName.name.substringBefore('.')
    if (fileName.endsWith('s') && // target class ends with s
      path.toFile().useLines { seq -> // read the file and find "enum"
        seq.any { it.contains("enum") }
      }){
      log.debug { "captured enum class: $fileName" }
      return record
    }
    return null
  }
}

private val log = KotlinLogging.logger {}

