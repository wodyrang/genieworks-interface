package net.genieworks.ginterface.batch.schedule.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.batch.schedule.reader.Cafe24ProductCollector;
import net.genieworks.ginterface.batch.schedule.writer.ProductWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 상품 관련 Job 정의 클래스.
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class ProductCollectionJobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    private final Cafe24ProductCollector cafe24ProductCollector;
    private final ProductWriter productWriter;

    /**
     * 상품 수집 작업
     * @param factory job 빌더
     * @param productCollectionStep 해당 잡에서 수행하는 스텝
     * @return producct collection job
     */
    @Bean
    public Job productCollectionJob() {
        return this.jobBuilderFactory.get("product-collection-job")
                .incrementer(new RunIdIncrementer())
                .start(this.cafe24ProductCollectorStep())
                .build();
    }

    /**
     * 실제 상품 수집 및 처리를 위한 step.
     * @return 상품 수집 처리 Step.
     */
    @Bean
    public Step cafe24ProductCollectorStep() {
        return this.stepBuilderFactory.get("product-collection-step")
                .chunk(1)
                .reader(this.cafe24ProductCollector)
                //.writer(this.productWriter) // 오류???
                .build();
    }



}

