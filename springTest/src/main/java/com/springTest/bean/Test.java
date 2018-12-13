package com.springTest.bean;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springTest.bean.Beanscope;


/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:50 2018/12/2
 * @Modified By:
 **/


public class Test {

   ClassPathXmlApplicationContext ctx;

    @org.junit.Test
    public void testSingleton(){

         ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanscope.xml");

        Beanscope beanscope = (Beanscope)ctx.getBean("beanscope");
        Beanscope beanscope1 = (Beanscope)ctx.getBean("beanscope");

        beanscope.say();
        beanscope1.say();
    }

    @org.junit.Test
    public void testProtype(){

        ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanscope.xml");

        Beanscope beanscope = (Beanscope)ctx.getBean("beanscope1");
        Beanscope beanscope1 = (Beanscope)ctx.getBean("beanscope1");

        beanscope.say();
        beanscope1.say();
    }


    @Before
    public void before(){
        System.out.println("before......");

    }

    @After
    public void after(){
        System.out.println("after......");
        ctx.destroy();
    }



}
