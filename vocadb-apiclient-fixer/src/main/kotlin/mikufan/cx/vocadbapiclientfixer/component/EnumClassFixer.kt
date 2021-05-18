package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.vocadbapiclientfixer.model.FixInfo
import mu.KotlinLogging
import org.jeasy.batch.core.processor.RecordProcessor
import org.jeasy.batch.core.record.GenericRecord
import org.jeasy.batch.core.record.Record
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.file.Path
import java.nio.file.Paths
import java.text.MessageFormat
import java.util.*
import kotlin.io.path.useLines

/**
 * do the processing
 * @date 2021-05-17
 * @author CX无敌
 */
@Component
class EnumClassFixer(
  @Value("\${config.multi-enums-class-template}") templateResource: String,
  @Value("\${config.enum-capture-regex}") val regex: Regex
): RecordProcessor<Path, FixInfo> {

  val template: String by lazy {
    val url = this::class.java.classLoader.getResource(templateResource)
      ?: throw RuntimeException("Can not find template for fixing enum classes").also {
        log.error(it) { "${it.message}" }
      }
    Paths.get(url.toURI()).useLines {
      it.joinToString("\n")
    }.also { log.info { "Successfully load java template" } }
  }

  override fun processRecord(record: Record<Path>): Record<FixInfo> {
    TODO("we need to read package")
    val enumList = record.payload.useLines { seq ->
      seq.map { regex.find(it) }
        .filter { Objects.isNull(it) }
        .map { it!!.groupValues[1] }
        .toList()
    }

    log.debug { "we got these enums for ${record.payload.fileName}: $enumList" }

    val enumSegment = enumList.joinToString(separator = ",\n\n", postfix = ";") { "    $it" }

    val fixedContent = MessageFormat.format(template, )

    val fixedInfo

    return GenericRecord<FixInfo>(record.header, )
  }
}

private val log = KotlinLogging.logger {}