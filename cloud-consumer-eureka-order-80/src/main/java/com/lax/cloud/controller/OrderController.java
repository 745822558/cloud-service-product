package com.lax.cloud.controller;

import com.lax.commons.entity.CommonResult;
import com.lax.commons.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description 订单接口
 * @Author liAnXin
 * @Date 2022/11/8 11:38
 **/
@RestController
@RequestMapping("/orders")
public class OrderController {

    //public static final String PAYMENT_URL = "http://localhost:8001";
    //修改为调用的服务名，同时开启远程调用模板的负载均衡
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param payment
     * @Description: 在订单域创建支付订单
     * @author liAnXin
     * @Date: 2022/11/8 11:49
     * @methodName create
     * @returns com.lax.springcloud.entity.CommonResult<com.lax.springcloud.entity.Payment>
     */
    @PostMapping("/payments")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payments", payment, CommonResult.class);
    }

    @GetMapping("/payments/{id}")
    public CommonResult<Payment> detail(@PathVariable("id") String id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payments/" + id, CommonResult.class);
    }

    @GetMapping("/payments/getForEntity/{id}")
    public CommonResult<Payment> detail2(@PathVariable("id") String id) {
        ResponseEntity<CommonResult> result = restTemplate.getForEntity(PAYMENT_URL + "/payments/" + id, CommonResult.class);
        if (result.getStatusCode().is2xxSuccessful()) {
            return result.getBody();
        } else {
            return new CommonResult<>(404, "响应失败！");
        }
    }
}

