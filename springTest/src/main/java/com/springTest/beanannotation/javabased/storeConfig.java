package com.springTest.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 10:30 2018/12/17
 * @Modified By:
 **/

@Configuration
public class storeConfig {

    @Bean( name = "storeString",  initMethod="init" , destroyMethod ="destory")
    public Store getStore(){
        return new storeString();
    }

}
