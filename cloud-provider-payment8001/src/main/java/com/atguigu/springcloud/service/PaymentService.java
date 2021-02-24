package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2021-02-23 16:11
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}