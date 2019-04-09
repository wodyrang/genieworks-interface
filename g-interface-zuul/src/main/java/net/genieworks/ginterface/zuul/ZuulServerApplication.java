package net.genieworks.ginterface.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Genie Works [Zuul Server] <br />
 * Zuul Server!
 *
 * TODO : Zuul Server 설명 추가 필요..
 * <pre>
 * </preß>
 */
@SpringBootApplication
@EnableZuulServer
public class ZuulServerApplication {

    /**
     * Start Zuul Server.
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class);
    }

}
