package com.springTest.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 10:30 2018/12/17
 * @Modified By:
 **/

@Configuration
@ImportResource("classpath:/META-INF/config.xml")
public class storeConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


    @Bean( name = "storeString",  initMethod="init" , destroyMethod ="destory")
    public Store getStore(){
        return new storeString();
    }

    @Bean
    public MyDriverManager myDriverManager(){
        return new MyDriverManager(url,username,password);
    }

}
