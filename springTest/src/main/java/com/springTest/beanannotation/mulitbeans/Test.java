package com.springTest.beanannotation.mulitbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 15:04 2018/12/13
 * @Modified By:
 **/


public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");

        Beaninvoke beaninvoke = (Beaninvoke)ctx.getBean("beaninvoke");

        beaninvoke.say();
    }


}
