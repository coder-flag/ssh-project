package com.springTest.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 11:24 2018/11/30
 * @Modified By:
 **/
public class Main {


      public static void  main(String[] args){
          ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

          helloworld hw  = (helloworld)ctx.getBean("helloworld");
          hw.sayHello();
      }


}
