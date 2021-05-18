package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.vocadbapiclientfixer.model.FixInfo
import mu.KotlinLogging
import org.jeasy.batch.core.processor.RecordProcessor
import org.jeasy.batch.core.record.Record
import org.springframework.beans.factory.annotation.Value
import java.io.IOException
import java.nio.file.Paths
import kotlin.io.path.useLines

/**
 * @date 2021-05-18
 * @author CX无敌
 */
class EnumClassFixer(
  @Value("\${config.multi-enums-class-template}") templateResource: String
): RecordProcessor<FixInfo, Unit> {

  val template by lazy {
    val url = this::class.java.classLoader.getResource(templateResource)
      ?: throw IOException("Can not find template for fixing enum classes")

    Paths.get(url.toURI()).useLines {
      it.joinToString("\n")
    }.also { log.info { "Successfully load java template" } }
  }

  override fun processRecord(record: Record<FixInfo>): Record<Unit> {
    TODO()
  }
}

private val log = KotlinLogging.logger {}