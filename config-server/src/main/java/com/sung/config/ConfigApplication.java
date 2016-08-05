package com.sung.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by sungang on 2016/7/31.
 * Spring Cloud构建微服务架构（四）分布式配置中心
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}
