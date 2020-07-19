package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Johnson
 * @Date 2020/6/22
 * @Date 10:27
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8001.class,args);
    }
}
