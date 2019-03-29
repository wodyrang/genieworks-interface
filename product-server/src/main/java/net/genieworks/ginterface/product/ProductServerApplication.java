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
 * 상품을 연동하기 위한 interface 서버
 * 1. 상품 연동을 위한 API제공
 * 2. 각 사이트 별로 상품정보를 수집하기 위한 수집 batch.
 * 3. 상품
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
