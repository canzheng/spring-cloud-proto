package com.netfinworks.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by canzheng on 6/9/15.
 */
@RestController
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
public class HelloService {
    @RequestMapping("/")
    public String home() {
        System.out.println("Hello invoked");
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }
}
