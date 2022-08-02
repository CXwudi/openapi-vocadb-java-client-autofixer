package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.inlinelogging.KInlineLogging
import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import org.springframework.stereotype.Component
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.*

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
    log.info { "Start cleaning up the output directory to avoid conflicting contents" }
    Files.list(outputDirectory)
      .parallel()
      .filter { it != outputDirectory && it != outputDirectory / ".git" && it != outputDirectory / ".gitignore" }
      .forEach {
        log.debug { "deleting $it" }
        deleteDirRecursively(it)
      }
    log.info { "Cleaned up existing files in $outputDirectory except git related directory" }
  }

  fun deleteDirRecursively(path: Path) {
    if (path.isDirectory()) {
      val contents = path.listDirectoryEntries()
      if (contents.isNotEmpty()) {
        for (f in contents) {
          if (!f.isSymbolicLink()) {
            deleteDirRecursively(f)
          }
        }
      }
    }
    path.deleteIfExists()
  }
}

private val log = KInlineLogging.logger()
