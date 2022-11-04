package com.lax.springcloud.service.impl;

import com.lax.springcloud.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(String id);
}
