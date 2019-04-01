package net.genieworks.ginterface.batch.schedule.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.batch.service.ProductService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 상품 관련 Job 정의 클래스.
 */
@Slf4j
@Configuration
public class ProductJob {

    /**
     * 상품 수집 작업
     * @param factory job 빌더
     * @param productCollectionStep 해당 잡에서 수행하는 스텝
     * @return producct collection job
     */
    @Bean
    public Job productCollectionJob(final JobBuilderFactory factory, Step productCollectionStep) {
        return factory.get("productCollectionJob")
                .incrementer(new RunIdIncrementer())
                .start(productCollectionStep)
                .build();
    }




}

