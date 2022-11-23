package com.lax.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName CloudErukaServer7001Application
 * @Description eruka启动类
 * @Author liAnXin
 * @Date 2022/11/14 13:56
 **/
@SpringBootApplication
@EnableEurekaServer
public class ErukaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(ErukaServer7001Application.class, args);
    }
}
