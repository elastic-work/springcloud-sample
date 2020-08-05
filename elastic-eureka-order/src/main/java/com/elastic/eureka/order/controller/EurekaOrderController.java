package com.elastic.eureka.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wfs
 * @Date: 2020/7/20 21:00
 * @Description:
 */
@RestController
@RequestMapping("order")
public class EurekaOrderController {
    @Autowired
    RestTemplate restTemplate;
    private static final String  REST_URL_PREFIX="http://elastic-pay";
    @RequestMapping("queryAll")
    public List<String> queryAll(){
        return Arrays.asList("Order-1","Order-2","Order-3");
    }
    @RequestMapping("querypayAll")
    public List<String> querypayAll(){
        List<String> list=new ArrayList<>();
        ResponseEntity<List> listResponseEntity = restTemplate.postForEntity(REST_URL_PREFIX + "/pay/queryAll", null, List.class);
        return listResponseEntity.getBody();
    }
}
