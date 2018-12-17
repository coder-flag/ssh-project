package com.springTest.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Objects;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:00 2018/12/16
 * @Modified By:
 **/
public class MoocAspect {

    public void before(){
        System.out.println("before....");
    }

    public void after(){
        System.out.println("after...");
    }

    public void throwing(){
        System.out.println("throwing");
    }

    public Object around(ProceedingJoinPoint pjp){

        Objects obj = null;

        try {
            System.out.println("around1");
            obj = (Objects) pjp.proceed();
            System.out.println("around2");
        }catch (Throwable e){
            e.printStackTrace();
        }


        return obj;
    }
}