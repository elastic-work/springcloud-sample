package com.lx.springcloud.service;


import com.lx.springcloud.dao.PaymentDao;
import com.lx.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Author Johnson
 * @Date 2020/7/15
 * @Date 23:21
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
