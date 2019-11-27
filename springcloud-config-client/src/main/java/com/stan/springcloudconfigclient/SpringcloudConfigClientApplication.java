package com.stan.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.stan")
public class SpringcloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClientApplication.class, args);
    }

}
