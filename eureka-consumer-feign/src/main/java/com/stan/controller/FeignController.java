package com.stan.controller;

import com.stan.service.api.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stan
 * Date: 2019/11/26 19:47
 * Content:
 */
@RestController
@RequestMapping("feign")
public class FeignController {


    @Autowired
    private IProviderService providerService;

    @Value("${server.port}")
    String port;


    @RequestMapping("test/{id}")
    public String test(@PathVariable(name = "id")Integer id){
        String s = providerService.test(id);

        return "端口号"+s;
    }


    @RequestMapping("test2")
    public String test2(){

        return "feign consumer端口"+port;
    }


}
