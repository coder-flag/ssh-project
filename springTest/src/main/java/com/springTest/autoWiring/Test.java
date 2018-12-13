package com.springTest.autoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 15:43 2018/12/3
 * @Modified By:
 **/
public class Test {

    ClassPathXmlApplicationContext ctx;

    @org.junit.Test
    public void test(){
        ctx = new ClassPathXmlApplicationContext("META-INF/spring-autowiring.xml");

        Service service = (Service)ctx.getBean("service");

        service.save("service");
    }
}
