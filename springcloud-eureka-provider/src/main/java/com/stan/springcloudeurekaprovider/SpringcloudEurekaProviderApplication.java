package com.stan.springcloudeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.stan")
public class SpringcloudEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaProviderApplication.class, args);
    }

}
