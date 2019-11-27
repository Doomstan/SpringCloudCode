package com.stan.controller;

import com.stan.service.api.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stan
 * Date: 2019/11/26 21:53
 * Content:
 */
@RestController
@RequestMapping("feignHystrix")
public class FeignHystrixController {



    @Autowired
    private IProviderService providerService;


    @RequestMapping("test/{id}")
    public String test(@PathVariable("id")Integer id){
        System.out.println("FeignHystrixController.test");
        return providerService.test(id);
    }

}
