package net.genieworks.ginterface.batch;

import net.genieworks.ginterface.batch.schedule.BatchScheduler;
import org.springframework.boot.SpringApplication;

/**
 * Genie Works [Batch Server] <br />
 * Batch Server!
 *
 * TODO : Batch Server 설명 추가 필요..
 * <pre>
 * </pre>
 */
public class BatchServerApplication {

    /**
     * Start Batch Server.
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BatchScheduler.class);
    }
}
