package mikufan.cx.vocadbapiclientfixer.config

import org.jeasy.batch.core.job.JobExecutor
import org.jeasy.batch.core.reader.FileRecordReader
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @date 2021-05-17
 * @author CX无敌
 */
@Configuration
class JobConfig {
  @Bean
  fun jobExecutor() = JobExecutor()

  @Bean
  fun modelReader(ioConfig: IOConfig) = FileRecordReader(ioConfig.modelPath, true)


}