package com.sung.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sungang on 2016/7/31.
 *
 * 创建ConsumerController来消费COMPUTE-SERVICE的add服务。
 * 通过直接RestTemplate来调用服务，计算10 + 20的值
 */
@RestController
public class ConsumerController {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }



}
