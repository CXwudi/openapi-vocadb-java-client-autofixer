package mikufan.cx.vocadbapiclientfixer

import mikufan.cx.inlinelogging.KInlineLogging
import mikufan.cx.vocadbapiclientfixer.config.IOConfig
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class VocaDbApiClientFixerApplicationTests {
  @Autowired
  lateinit var ioConfig: IOConfig

  @Test
  fun contextLoads() {
    log.debug { "ioConfig = $ioConfig" }
  }
}

private val log = KInlineLogging.logger()
