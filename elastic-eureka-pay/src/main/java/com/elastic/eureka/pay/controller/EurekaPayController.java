package com.elastic.eureka.pay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author: wfs
 * @Date: 2020/7/20 21:00
 * @Description:
 */
@RestController
@RequestMapping("pay")
public class EurekaPayController {
    @RequestMapping("queryAll")
    public List<String> queryAll(){
        return Arrays.asList("pay-4","pay-5","pay-6");
    }
}
