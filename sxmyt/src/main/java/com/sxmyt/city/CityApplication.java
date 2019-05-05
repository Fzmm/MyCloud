package com.sxmyt.city;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "com.sxmyt.city.mapper")
public class CityApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CityApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class, args);
        System.out.println("======================================启动成功==================================");
    }



}
