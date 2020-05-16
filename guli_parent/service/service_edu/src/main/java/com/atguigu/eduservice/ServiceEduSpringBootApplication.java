package com.atguigu.eduservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.eduservice.mapper")
public class ServiceEduSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEduSpringBootApplication.class, args);
    }
}
