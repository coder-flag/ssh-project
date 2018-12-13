package com.springTest.beanannotation;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:32 2018/12/12
 * @Modified By:
 **/


public class TestAnnotation {

    @Test
    public void testset(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");
        BeanAnnotation beanAnnotation = (BeanAnnotation) ctx.getBean("beanAnnotation");
        beanAnnotation.myhash();
        beanAnnotation.say("this is annotation");
        BeanAnnotation beanAnnotation1 = (BeanAnnotation) ctx.getBean("beanAnnotation");
        beanAnnotation1.myhash();
        beanAnnotation1.say("this is annotation");

    }

//    @Test
//    public  void test2(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring-beanannotation.xml");
//        BeanAnnotation beanAnnotation1 = (BeanAnnotation) ctx.getBean("beanAnnotation");
//        beanAnnotation1.myhash();
//        beanAnnotation1.say("this is annotation");
//    }

}
