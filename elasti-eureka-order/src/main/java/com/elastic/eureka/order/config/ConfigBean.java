package com.elastic.eureka.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 梦学谷
 */
@Configuration //标识配置类
public class ConfigBean {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
