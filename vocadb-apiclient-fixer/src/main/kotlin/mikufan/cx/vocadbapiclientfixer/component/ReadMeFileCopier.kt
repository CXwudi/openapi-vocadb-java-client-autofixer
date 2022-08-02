package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.inlinelogging.KInlineLogging
import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import kotlin.io.path.copyTo
import kotlin.io.path.moveTo

/**
 * @date 2022-08-02
 * @author CX无敌
 */
@Component
class ReadMeFileCopier(
  private val ioConfig: IOConfig,
  @Value("\${config.old-readme-new-filename}") private val newFilenameForOldReadme: String,
  @Value("\${config.dry-run}") val dryRun: Boolean
) {

  fun doCopy() {
    ioConfig.optionalReadmeFile?.let { newReadmeFile ->
      val oldReadmeFile = ioConfig.outputProjectDirectory.resolve("README.md")
      if (dryRun) {
        log.info { "dry run moved old readme file to $newFilenameForOldReadme, and copied new readme file $newReadmeFile as the new readme" }
      } else {
        oldReadmeFile.moveTo(ioConfig.outputProjectDirectory.resolve(newFilenameForOldReadme))
        newReadmeFile.copyTo(oldReadmeFile)
        log.info { "Moved old readme file to $newFilenameForOldReadme, and copied new readme file $newReadmeFile as the new readme" }
      }
    }
  }
}

private val log = KInlineLogging.logger()
