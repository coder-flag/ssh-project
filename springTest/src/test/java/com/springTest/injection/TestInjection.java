package com.springTest.injection;

import com.springTest.base.UnitTestBase;
import com.springTest.ioc.service.InjectionServiceImpl;
import junit.framework.JUnit4TestCaseFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 21:10 2018/11/30
 * @Modified By:
 **/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection(){
        super("classpath:spring-injection.xml");
    }

    @Test
    public void Testset(){
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("META-INF/spring-injection.xml");

        InjectionServiceImpl injectionServiceImpl = (InjectionServiceImpl) ctx.getBean("injectionServiceImpl");

        injectionServiceImpl.save("helloworld");

    }
}
