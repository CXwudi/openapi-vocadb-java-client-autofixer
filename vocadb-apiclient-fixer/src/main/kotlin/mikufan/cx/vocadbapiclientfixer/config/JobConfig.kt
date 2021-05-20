package mikufan.cx.vocadbapiclientfixer.config

import mu.KotlinLogging
import org.jeasy.batch.core.reader.FileRecordReader
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.IOException

/**
 * @date 2021-05-18
 * @author CX无敌
 */
@Configuration
class JobConfig {

  @Bean("modelReader")
  fun modelReader(ioConfig: IOConfig) = object : FileRecordReader(ioConfig.modelPath, true) {
    private val log = KotlinLogging.logger {}
    override fun open() {
      val copied = ioConfig.inputProjectDirectory.toFile()
        .copyRecursively(ioConfig.outputProjectDirectory.toFile(), true)
      if(copied){
        log.debug { "Copied input project directory '${ioConfig.inputProjectDirectory}' " +
            "to output project directory '${ioConfig.outputProjectDirectory}' for writing" }
        super.open()
      } else {
        throw IOException("Failed to copy input project directory '${ioConfig.inputProjectDirectory}' " +
            "to output project directory '${ioConfig.outputProjectDirectory}'")
      }
    }
  }

  @Bean("projectReader")
  fun projectReader(ioConfig: IOConfig) = FileRecordReader(ioConfig.outputProjectDirectory, true)
}

