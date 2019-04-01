package net.genieworks.ginterface.batch.schedule;

import lombok.RequiredArgsConstructor;
import net.genieworks.ginterface.batch.service.ProductService;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 배치 스케줄 정의
 */
@Configuration
@EnableScheduling
@SpringBootApplication
@EnableBatchProcessing
@RequiredArgsConstructor
public class BatchScheduler {

    private final ProductService productService;




}
