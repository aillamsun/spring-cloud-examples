package com.sung;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by sungang on 2016/7/31.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewagApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewagApplication.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
