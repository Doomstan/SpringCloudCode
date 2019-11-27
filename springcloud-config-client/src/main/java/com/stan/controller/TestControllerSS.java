package com.stan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stan
 * Date: 2019/11/27 17:59
 * Content:
 */
@RestController
@RefreshScope  //配置文件自动刷新
@RequestMapping("configtest")
public class TestControllerSS {


    @Value("${server.port}")
    private String port;

    @RequestMapping("test")
    public String test(){
        return port;
    }


}
