package com.elastic.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author: wfs
 * @Date: 2020/7/20 17:13
 * @Description:
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @RequestMapping("queryAll")
    public List<String> queryAllOrders(){
        return Arrays.asList("1","2","3");
    }
}
