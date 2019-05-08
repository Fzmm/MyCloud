package com.sxmyt.city;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.sxmyt.city.mapper")
public class CityApplication  {

    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class, args);
        System.out.println("======================================启动成功==================================");
    }



}
