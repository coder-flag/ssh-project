package com.springTest.Aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:53 2018/12/3
 * @Modified By:
 **/
public class Test {

    ClassPathXmlApplicationContext ctx;

    @org.junit.Test
    public void testApplicationContext(){
        ctx = new ClassPathXmlApplicationContext("META-INF/spring-aware.xml");

        System.out.println("testApplicationContext:" + ctx.getBean("applicationContext").hashCode());
    }

    @org.junit.Test
    public void testBeanName(){
        ctx = new ClassPathXmlApplicationContext("META-INF/spring-aware.xml");

       System.out.println("testBeanName:" + ctx.getBean("beanname").hashCode());
    }
}
