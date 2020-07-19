package com.springcloud.service;

import com.lx.springcloud.entities.Payment;
import com.springcloud.dao.PaymentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Johnson
 * @Date 2020/6/22
 * @Date 12:27
 */
@Service
public class PaymentServiceImpl implements  PaymentService {
    @Resource
   private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        System.out.println("id为多少"+id);
        return paymentDao.getPaymentById(id);
    }
}
