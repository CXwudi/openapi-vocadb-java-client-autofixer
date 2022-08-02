package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.inlinelogging.KInlineLogging
import org.jeasy.batch.core.mapper.RecordMapper
import org.jeasy.batch.core.record.GenericRecord
import org.jeasy.batch.core.record.Record
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.moveTo
import kotlin.io.path.name

/**
 * @date 2021-05-19
 * @author CX无敌
 */
@Component
class ApiApiFileRenamer : RecordMapper<Path, Path> {
  override fun processRecord(record: Record<Path>): Record<Path> {
    val path = record.payload
    val fileName = path.fileName.name
    return if (fileName.contains("ApiApi")) {
      val newFileName = fileName.replace("ApiApi", "Api")
      val newPath = path.moveTo(path.resolveSibling(newFileName), true)
      log.debug { "Renamed $path to $newPath" }
      GenericRecord(record.header, newPath)
    } else {
      record
    }
  }
}

private val log = KInlineLogging.logger()
