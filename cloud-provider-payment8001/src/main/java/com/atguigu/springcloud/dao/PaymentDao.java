package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2021-02-23 15:52
 */
@Mapper
public interface PaymentDao
{
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
