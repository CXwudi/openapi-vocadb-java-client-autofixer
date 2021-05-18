package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.vocadbapiclientfixer.model.FixInfo
import mu.KotlinLogging
import org.jeasy.batch.core.mapper.RecordMapper
import org.jeasy.batch.core.record.GenericRecord
import org.jeasy.batch.core.record.Record
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.file.Path
import kotlin.io.path.name
import kotlin.io.path.useLines

/**
 * do the processing
 * @date 2021-05-17
 * @author CX无敌
 */
@Component
class EnumClassExtractor(
  @Value("\${config.enum-capture-regex}") val enumRegex: Regex,
  @Value("\${config.package-capture-regex}") val packageRegex: Regex
): RecordMapper<Path, FixInfo> {

  override fun processRecord(record: Record<Path>): Record<FixInfo> {
    lateinit var `package`: String
    val enumList = mutableListOf<String>()

    record.payload.useLines { seq ->
      val itr = seq
        .filter { it.isNotBlank() }.iterator() // use iterator to partially read file
      while (itr.hasNext()){ // first, find package
        val next = itr.next()
        if (packageRegex.containsMatchIn(next)){
          val packageCaptures = (packageRegex.find(next)?.groupValues
            ?: throw RuntimeException("Can not find package in $next with regex ${packageRegex.pattern}"))
          `package` = packageCaptures[1] // [0] is the entire match, so starting from [1]
          break
        }
      }
      var shouldBreak = false
      while (itr.hasNext()){ // then find enums
        val next = itr.next()
        val isMatched = enumRegex.containsMatchIn(next)
        if (isMatched){
          val enumCaptures = enumRegex.find(next)?.groupValues
            ?: throw RuntimeException("Can not find package in $next with regex ${enumRegex.pattern}")
          enumList += enumCaptures[1]
          if (next.contains(';')) shouldBreak = true // check if it is the last enum
        }
        if (shouldBreak) break
      }
    }
    val fixInfo = FixInfo(record.payload, `package`, record.payload.fileName.name, enumList)
    log.debug { "Extracted these info for fixing enum $fixInfo" }
    return GenericRecord(record.header, fixInfo)
  }
}

private val log = KotlinLogging.logger {}