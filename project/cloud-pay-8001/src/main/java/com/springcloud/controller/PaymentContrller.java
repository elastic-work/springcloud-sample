package com.springcloud.controller;


import com.lx.springcloud.entities.CommonResult;
import com.lx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @Author Johnson
 * @Date 2020/6/22
 * @Date 12:30
 */
@RestController
@Slf4j
public class PaymentContrller {
    @Resource
   private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    //插入
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            //成功
            log.info("插入成功",i);
            return  new CommonResult(200,"插入成功"+serverPort,i);
        }else{
            //失败
            log.info("插入失败");
            return  new CommonResult(333,"插入失败"+serverPort,null);
        }
    }

    //根据id查询
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(!Objects.isNull(payment)){
            //成功
            log.info("查询成功",payment);
            return  new CommonResult(200,"查询成功"+serverPort,payment);
        }else{
            //失败
            log.info("查询失败");
            return  new CommonResult(444,"查询失败,没有找到对应的id:"+id+serverPort,null);
        }
    }


}
