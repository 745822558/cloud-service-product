package com.lax.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lax.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentMapper
 * @Description 支付类mapper
 * @Author liAnXin
 * @Date 2022/11/4 11:19
 **/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

//    public int create(Payment payment);
//
//    public Payment getPaymentById(@Param("id") String id);
}
