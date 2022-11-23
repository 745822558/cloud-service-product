package com.lax.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Description 支付接口层
 * @Author liAnXin
 * @Date 2022/11/15 9:52
 **/
@Slf4j
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/test")
    public void selectPayment() {
        log.info("查询成功！");
    }
}
