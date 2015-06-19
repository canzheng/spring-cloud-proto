package com.netfinworks.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by canzheng on 6/17/15.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
@RestController
public class HelloClientApp {
    @Autowired
    HelloClient helloClient;

    @RequestMapping("/hello")
    public String home() {
        return helloClient.hello();
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloClientApp.class, args);
    }
}
