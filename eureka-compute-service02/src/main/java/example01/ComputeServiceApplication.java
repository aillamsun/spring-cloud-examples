package example01;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by sungang on 2016/7/31.
 *
 * 创建“服务提供方”
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }
}
