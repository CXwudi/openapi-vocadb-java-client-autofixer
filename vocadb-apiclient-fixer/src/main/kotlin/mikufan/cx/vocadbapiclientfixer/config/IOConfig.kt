package mikufan.cx.vocadbapiclientfixer.config

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.validation.annotation.Validated
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import kotlin.io.path.name

/**
 * @date 2021-05-17
 * @author CX无敌
 */
@ConfigurationProperties("io")
@ConstructorBinding @Validated
class IOConfig (
  @NotNull val inputProjectDirectory: Path,
  backupSuffix: String,
  modelRelativePath: Path){

  @NotNull
  val backupProjectDirectory: Path = inputProjectDirectory.resolveSibling(
    inputProjectDirectory.fileName.name + backupSuffix)

  @NotNull
  val modelPath: Path = inputProjectDirectory.resolve(modelRelativePath)

  fun makeBackup(){
    Files.copy(inputProjectDirectory, backupProjectDirectory, StandardCopyOption.REPLACE_EXISTING)
  }

}