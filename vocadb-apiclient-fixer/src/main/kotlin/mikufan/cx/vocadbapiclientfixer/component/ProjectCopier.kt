package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.inlinelogging.KInlineLogging
import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.util.FileSystemUtils
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.div

/**
 * @date 2022-08-02
 * @author CX无敌
 */
@Component
class ProjectCopier(
  ioConfig: IOConfig,
  @Value("\${config.project-copier.ignore-path}") private val ignorePathNames: List<String>
) {
  private val inputDirectory: Path = ioConfig.inputProjectDirectory
  private val outputDirectory: Path = ioConfig.outputProjectDirectory

  fun cleanThenCopy() {
    clean()
    copy()
  }

  private fun clean() {
    log.info { "Start cleaning up the output directory to avoid conflicting contents" }
    Files.list(outputDirectory)
      .parallel()
      .filter { it != outputDirectory && ignorePathNames.all { ignoredPathName -> it != outputDirectory / ignoredPathName } }
      .forEach {
        log.debug { "deleting $it" }
        FileSystemUtils.deleteRecursively(it)
      }
    log.info { "Cleaned up existing files in $outputDirectory except git related directory" }
  }

  private fun copy() {
    log.info { "Starting copying the fresh copy of unfixed api client at $inputDirectory to $outputDirectory" }
    Files.list(inputDirectory)
      .parallel()
      .filter { it != inputDirectory && ignorePathNames.all { ignoredPathName -> it != inputDirectory / ignoredPathName } }
      .forEach {
        log.debug { "copying $it" }
        FileSystemUtils.copyRecursively(it, outputDirectory / it.fileName)
      }
    log.info { "Done copy the fresh copy" }
  }
}

private val log = KInlineLogging.logger()
