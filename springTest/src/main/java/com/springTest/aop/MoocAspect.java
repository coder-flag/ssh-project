package com.springTest.aop;



import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:00 2018/12/16
 * @Modified By:
 **/


@Component
@Aspect
public class MoocAspect {


    @Pointcut("execution(* com.springTest.aop.Moocbiz.*(..))")
    public void pointcut(){
    }

    @Before("execution(* com.springTest.aop.Moocbiz.say(..)) && args(a)" )
    public void before(String a){
        System.out.println("before...." + a);
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after...");
    }


    @AfterThrowing("pointcut()")
    public void throwing(){
        System.out.println("throwing");
    }

//    public Object around(ProceedingJoinPoint pjp){
//
//        Objects obj = null;
//
//        try {
//            System.out.println("around1");
//            obj = (Objects) pjp.proceed();
//            System.out.println("around2");
//        }catch (Throwable e){
//            e.printStackTrace();
//        }
//
//
//        return obj;
//    }
}
