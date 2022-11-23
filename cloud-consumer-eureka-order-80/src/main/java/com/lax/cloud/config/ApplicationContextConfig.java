package com.lax.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description 应用程序上下文配置
 * @Author liAnXin
 * @Date 2022/11/8 11:42
 **/

@Configuration
public class ApplicationContextConfig {

    /**
     * 定义一个restTemplate 去远程调用的时候用
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
