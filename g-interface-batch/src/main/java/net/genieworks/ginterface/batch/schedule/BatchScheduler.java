package net.genieworks.ginterface.batch.schedule;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 배치 스케줄 정의
 */
@Configuration
@EnableScheduling
@SpringBootApplication
@EnableBatchProcessing
@RequiredArgsConstructor
public class BatchScheduler {

    private final JobLauncher launcher;
    private final Job productCollectionJob;

    /**
     * 외부상품 수집 배치.
     * @throws Exception exception.
     */
    @Scheduled(fixedDelay = 1000000)
    public void collectProduct() throws Exception {
        this.launcher.run(this.productCollectionJob, new JobParameters());
    }




}
