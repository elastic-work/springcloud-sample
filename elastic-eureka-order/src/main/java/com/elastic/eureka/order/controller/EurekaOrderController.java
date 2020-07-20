package com.elastic.eureka.order.controller;

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
@RequestMapping("order")
public class EurekaOrderController {
    @RequestMapping("queryAll")
    public List<String> queryAll(){
        return Arrays.asList("1","2","3");
    }
}
