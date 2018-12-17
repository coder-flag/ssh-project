package com.springTest.beanannotation.javabased;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 10:27 2018/12/17
 * @Modified By:
 **/

public class Test {

    @org.junit.Test
    public void test(){


        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");
        Store store = (storeString)ctx.getBean("storeString");
        System.out.println(store.getClass().getName());
        ((ClassPathXmlApplicationContext) ctx).destroy();

    }

    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");
        Store store = (storeString)ctx.getBean("myDriverManager");
        System.out.println(store.getClass().getName());
        ((ClassPathXmlApplicationContext) ctx).destroy();
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");
       MyDriverManager myDriverManager = (MyDriverManager)ctx.getBean("myDriverManager");
        myDriverManager.PrintString();
    }
}
