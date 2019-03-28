package net.genieworks.ginterface.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Genie Works [Product Server] <br />
 * Product Server!
 *
 * TODO : Product Server 설명 추가 필요..
 * <pre>
 *
 * </pre>
 */
@SpringBootApplication
@RefreshScope
public class ProductServerApplication {

    /**
     * Start Product Server.
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ProductServerApplication.class);
    }
}
