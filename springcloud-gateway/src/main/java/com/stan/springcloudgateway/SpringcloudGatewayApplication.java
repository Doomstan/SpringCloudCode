package com.stan.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayApplication.class, args);
    }



    @Bean(name = "myKeyResolver")
    public KeyResolver keyResolver(){
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                //根据URI来限流
                return Mono.just(exchange.getRequest().getURI().getPath());
            }
        };
    }
}
