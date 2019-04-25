package com.city.fzmlly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class FzmllyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FzmllyApplication.class, args);
    }

}
