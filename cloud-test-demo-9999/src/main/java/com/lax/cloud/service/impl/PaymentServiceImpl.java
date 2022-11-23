package com.lax.cloud.service.impl;

import com.lax.cloud.entity.Payment;
import com.lax.cloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author liAnXin
 * @Date 2022/11/4 11:49
 **/

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(String id) {
        return paymentMapper.selectById(id);
    }
}
