package com.lax.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
@SpringBootApplication
@EnableEurekaClient
public class SpringBootRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunApplication.class, args);
    }
}
