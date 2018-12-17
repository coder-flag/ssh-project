package com.springTest.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:00 2018/12/16
 * @Modified By:
 **/
@Component
public class Moocbiz {



    public void say(String str){

        System.out.println("moocbiz..." + str);
//        throw new  RuntimeException();
    }
}
