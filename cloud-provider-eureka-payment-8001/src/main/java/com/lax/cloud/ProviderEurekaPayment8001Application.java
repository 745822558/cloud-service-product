package com.lax.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentMain8001
 * @Description TODO
 * @Author liAnXin
 * @Date 2022/10/20 15:52
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderEurekaPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderEurekaPayment8001Application.class, args);
    }
}
