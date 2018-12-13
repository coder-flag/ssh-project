package com.springTest.ioc;

import com.springTest.ioc.service.InjectionService;
import com.springTest.ioc.service.InjectionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 21:39 2018/11/30
 * @Modified By:
 **/
public class Test {

    @org.junit.Test
    public void Testset(){
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("META-INF/spring-injection.xml");

        InjectionService injectionService = (InjectionService) ctx.getBean("injectionService");

        injectionService.save("helloworld");

    }

    @org.junit.Test
    public void TestCons(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-injection.xml");

        InjectionService injectionService = (InjectionService) ctx.getBean("injectionService");

        injectionService.save("cons");
    }
}
