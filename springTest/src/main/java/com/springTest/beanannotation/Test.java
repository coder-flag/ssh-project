package com.springTest.beanannotation;

import com.springTest.beanannotation.injection.service.InjectionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:20 2018/12/13
 * @Modified By:
 **/


public class Test {

    @org.junit.Test
    public void Testset(){
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");

        InjectionServiceImpl injectionServiceImpl = (InjectionServiceImpl) ctx.getBean("injectionServiceImpl");

        injectionServiceImpl.save("setter");

    }

    @org.junit.Test
    public void TestCons(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");

        InjectionServiceImpl injectionServiceImpl = (InjectionServiceImpl) ctx.getBean("injectionServiceImpl");

        injectionServiceImpl.save("cons");
    }
}

