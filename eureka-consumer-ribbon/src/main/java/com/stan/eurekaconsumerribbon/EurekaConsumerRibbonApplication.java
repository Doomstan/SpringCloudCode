package com.stan.eurekaconsumerribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.stan")
public class EurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }


    /**
     * 注入 RestTemplate-用来调用服务
     * 且具备启负载均衡能力
     */
    @Bean
    @LoadBalanced  //开启负载均衡
    public RestTemplate  restTemplate(){
      return   new RestTemplate();
    }

    /**
     * 设置负载均衡策略 -- 随机
     * Ribbon
     */
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
