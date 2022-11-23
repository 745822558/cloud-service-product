package com.lax.cloud.service.impl;

import com.lax.cloud.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(String id);
}
