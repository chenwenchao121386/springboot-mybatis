package com.atguigu.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User(9527,"魁拔","123456","carton");
    }
}
