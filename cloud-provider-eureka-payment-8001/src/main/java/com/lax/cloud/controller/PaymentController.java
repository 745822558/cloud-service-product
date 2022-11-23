package com.lax.cloud.controller;

import com.lax.commons.entity.CommonResult;
import com.lax.cloud.entity.Payment;
import com.lax.cloud.service.impl.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping
    public CommonResult<Integer> createPayment(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        if (result > 0) {
            log.info("插入成功！");
            return new CommonResult(200, "插入成功！serverPort=" + serverPort, result);
        } else {
            log.info("插入失败！");
            return new CommonResult(444, "插入失败！", null);
        }
    }

    @GetMapping("/test")
    public CommonResult<Payment> selectPayment() {
        Payment payment = paymentService.getPaymentById("745822558");

        if (payment != null) {
            log.info("查询成功！");
            return new CommonResult(200, "查询成功！serverPort=" + serverPort, payment);
        } else {
            log.info("查询失败！");
            return new CommonResult(410, "没有对应结果！", null);
        }
    }
    @GetMapping("/{id}")
    public CommonResult<Payment> selectPaymentById(@PathVariable("id") String id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            log.info("查询成功！");
            return new CommonResult(200, "查询成功！serverPort=" + serverPort, payment);
        } else {
            log.info("查询失败！");
            return new CommonResult(410, "没有对应结果！", null);
        }
    }
}
