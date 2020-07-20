package com.elastic.eureka.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: wfs
 * @Date: 2020/7/20 21:01
 * @Description:
 */
@EnableEurekaServer //标识一个Eureka Server 服务注册中心
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EurekaOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderApplication.class, args);
    }
}