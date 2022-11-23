package com.lax.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description TODO
 * @Author liAnXin
 * @Date 2022/10/20 15:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProviderEurekaPayment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderEurekaPayment8002Application.class, args);
    }
}
