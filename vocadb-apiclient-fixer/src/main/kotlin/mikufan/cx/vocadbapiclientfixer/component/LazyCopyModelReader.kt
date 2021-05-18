package mikufan.cx.vocadbapiclientfixer.component

import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import mu.KotlinLogging
import org.jeasy.batch.core.reader.FileRecordReader
import org.springframework.stereotype.Component
import java.io.IOException

/**
 * @date 2021-05-18
 * @author CX无敌
 */
@Component
class LazyCopyModelReader(
  ioConfig: IOConfig
) : FileRecordReader(ioConfig.modelPath, true) {

  val copied by lazy {
    ioConfig.inputProjectDirectory.toFile()
      .copyRecursively(ioConfig.outputProjectDirectory.toFile(), true)
      .also {
        if (it) log.debug { "Copied input project directory '${ioConfig.inputProjectDirectory}' " +
            "to output project directory '${ioConfig.outputProjectDirectory}' for writing" }
      }
  }

  val exceptionString by lazy(LazyThreadSafetyMode.NONE) {
    "Failed to copy input project directory '${ioConfig.inputProjectDirectory}' " +
        "to output project directory '${ioConfig.outputProjectDirectory}'"
  }

  override fun open() {
    if(copied){
      super.open()
    } else {
      throw IOException(exceptionString)
    }
  }
}

private val log = KotlinLogging.logger {}