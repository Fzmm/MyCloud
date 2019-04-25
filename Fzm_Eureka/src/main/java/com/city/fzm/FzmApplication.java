package com.city.fzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FzmApplication {

    public static void main(String[] args) {
        SpringApplication.run(FzmApplication.class, args);
    }

}
