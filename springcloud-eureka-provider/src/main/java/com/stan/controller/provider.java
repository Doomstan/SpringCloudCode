package com.stan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stan
 * Date: 2019/11/26 17:35
 * Content:
 */
@RestController
@RequestMapping("provider")
public class provider {


    @Value("${server.port}")
    private String  port;
    @RequestMapping("test")
    public String test(){
        return port;
    }

}
