package com.lax.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName PaymentMain8001
 * @Description TODO
 * @Author liAnXin
 * @Date 2022/10/20 15:52
 **/
@SpringBootApplication(scanBasePackages = {"com.lax.springcloud.entity"})
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class, args);
    }
}
