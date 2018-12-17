package com.springTest.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:18 2018/12/16
 * @Modified By:
 **/
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-aop.xml");

        Moocbiz moocbiz =  (Moocbiz) ctx.getBean("moocbiz");

        moocbiz.say("this is test");
    }
}
