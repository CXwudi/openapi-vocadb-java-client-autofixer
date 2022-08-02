package mikufan.cx.vocadbapiclientfixer.config

import org.jetbrains.annotations.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.validation.annotation.Validated
import java.nio.file.Path

/**
 * @date 2021-05-17
 * @author CX无敌
 */
@ConfigurationProperties("io")
@ConstructorBinding
@Validated
class IOConfig(
  @NotNull val inputProjectDirectory: Path,
  @NotNull val outputProjectDirectory: Path,
  modelRelativePath: Path
) {

  @NotNull
  val modelPath: Path = outputProjectDirectory.resolve(modelRelativePath)

  fun doCopy() {
    inputProjectDirectory.toFile().copyRecursively(outputProjectDirectory.toFile(), true)
  }
}
