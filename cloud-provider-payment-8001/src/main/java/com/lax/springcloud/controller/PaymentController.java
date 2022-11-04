package com.lax.springcloud.controller;

import com.lax.springcloud.CommonResult;
import com.lax.springcloud.entity.Payment;
import com.lax.springcloud.service.impl.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author liAnXin
 * @Date 2022/11/4 13:52
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult<Integer> craetePayment(Payment payment) {

        int result = paymentService.create(payment);
        if (result > 0) {
            log.info("插入成功！");
            return new CommonResult(200, "插入成功！", result);
        } else {
            log.info("插入失败！");
            return new CommonResult(444, "插入失败！", null);
        }
    }

    @GetMapping(value = "{id}")
    public CommonResult<Payment> selectPaymentById(@PathVariable("id") String id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            log.info("查询成功！");
            return new CommonResult(200, "查询成功！", payment);
        } else {
            log.info("查询失败！");
            return new CommonResult(410, "没有对应结果！", null);
        }
    }
}
