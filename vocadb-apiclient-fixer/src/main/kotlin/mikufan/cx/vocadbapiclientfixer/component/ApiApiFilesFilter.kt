package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import mu.KotlinLogging
import org.jeasy.batch.core.filter.RecordFilter
import org.jeasy.batch.core.record.Record
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.name

/**
 * @date 2021-05-20
 * @author CX无敌
 */
@Component
class ApiApiFilesFilter(
  ioConfig: IOConfig,
  @Value("\${config.api-api-fix.ignore-directory}") val regexes: List<Regex>
): RecordFilter<Path> {
  val projectDir = ioConfig.outputProjectDirectory
  //val regexes = regexStrings.map {Regex(it)}

  override fun processRecord(record: Record<Path>): Record<Path>? {
    val path = record.payload
    val relativePath = projectDir.relativize(path)
    val folders = relativePath.toList()
    val firstFolderOrFile = folders[0].fileName.name
    return if (regexes.any { it.containsMatchIn(firstFolderOrFile) }){
      log.debug { "Ignoring scanning on $relativePath" }
      null
    } else {
      record
    }
  }
}

private val log = KotlinLogging.logger {}
