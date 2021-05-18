package mikufan.cx.vocadbapiclientfixer

import mikufan.cx.vocadbapiclientfixer.service.MainService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class VocaDbApiClientFixerApplication

fun main(args: Array<String>) {
  val context = runApplication<VocaDbApiClientFixerApplication>(*args)
  context.getBean(MainService::class.java).run()
}
