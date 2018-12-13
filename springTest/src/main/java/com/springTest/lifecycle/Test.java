package com.springTest.lifecycle;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:27 2018/12/3
 * @Modified By:
 **/
public class Test {

   ClassPathXmlApplicationContext ctx;
    


    @org.junit.Test
    public void Testlifecycle(){


        ctx = new ClassPathXmlApplicationContext("META-INF/spring-lifecycle.xml");


        System.out.println("获取了bean" + (lifecycle)ctx.getBean("lifecycle"));

    }

    @Before
    public void before(){
//        System.out.println("before......");

    }

    @After
    public void after(){
//        System.out.println("after......");
        ctx.destroy();
    }

   


}
