package com.sung;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Created by sungang on 2016/7/31.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeApiAApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeApiAApplication.class).web(true).run(args);
    }
}
