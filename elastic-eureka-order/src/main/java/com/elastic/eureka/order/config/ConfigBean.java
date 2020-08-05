package com.elastic.eureka.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wfs
 */
@Configuration
public class ConfigBean {
    /**
     *  @LoadBalanced 表示这个RestTemplate开启负载均衡，在调用服务提供者的接口时
     *  可以使用服务名称，替代真实的ip地址。服务名称就是提供者在 aoolication.yml
     *  中配置的spring.application.name配置属性的值
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
