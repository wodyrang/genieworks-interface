package net.genieworks.ginterface.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Genie Works [Admin] <br />
 * Admin!
 *
 * TODO : Admin 설명 추가 필요..
 * <pre>
 *
 * </pre>
 */
@SpringBootApplication
@RefreshScope
public class AdminApplication {

    /**
     * Start Admin
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class);
    }
}
