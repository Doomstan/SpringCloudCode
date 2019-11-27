package com.stan.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: Stan
 * Date: 2019/11/26 21:11
 * Content:
 */
@RestController
@RequestMapping("rhystrix")
public class RibbonAndHystrixController {


    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("test/{id}")
    @HystrixCommand(defaultFallback = "mydef") //被动降级方法  defaultFallback 定义回调方法
    public String hystrix(@PathVariable("id")Integer id){
        System.out.println("RibbonAndHystrixController.hystrix");
        String forObject = restTemplate.getForObject("http://EUREKA-PROVIDER/provider/test/"+id, String.class);
        return "rhystrix+port"+forObject;
    }

    public String mydef(){
        return "服务调度失败，请重试";
    }
}
