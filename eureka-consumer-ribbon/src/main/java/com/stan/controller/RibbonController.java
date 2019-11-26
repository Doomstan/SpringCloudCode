package com.stan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: Stan
 * Date: 2019/11/26 17:30
 * Content:
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("test")
    public String RibbonTest(){

        //1:通过RestTemplate 获取调用服务返回的
        //* 参数
        //         *  1:添加注册到Eureka的微服务名称  不要填写ip地址:http://localhost:8081/provider/test 这不符合负载均衡 开启负载均衡后 ip地址写法失效
        //         *  2:返回类型
        String forObject = restTemplate.getForObject("http://EUREKA-PROVIDER/provider/test", String.class);
        System.out.println(restTemplate.getUriTemplateHandler());
        System.out.println(forObject);
        return "调用服务端口"+forObject;
    }



}
