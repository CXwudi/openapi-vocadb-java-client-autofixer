package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.inlinelogging.KInlineLogging
import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import org.springframework.stereotype.Component
import java.nio.file.Files
import kotlin.io.path.Path
import kotlin.io.path.deleteIfExists

/**
 * @date 2022-08-02
 * @author CX无敌
 */
@Component
class OutputDirectoryCleaner(
  ioConfig: IOConfig
) {
  private val outputDirectory = ioConfig.outputProjectDirectory

  fun clean() {
    Files.walk(outputDirectory)
      .parallel()
      .filter { it != Path(".git") }
      .forEach {
        it.deleteIfExists()
      }
    log.info { "Cleaned up existing files in $outputDirectory except .git" }
  }
}

private val log = KInlineLogging.logger()
