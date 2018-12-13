package com.springTest.bean;

import com.springTest.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 15:18 2018/12/2
 * @Modified By:
 **/

@RunWith(BlockJUnit4ClassRunner.class)
public class Testscope extends UnitTestBase {


    public Testscope(){ super("classpath:spring-beanscope.xml"); }

    @Test
    public void test(){

        Beanscope beanscope = super.getBean("beanscope");
        beanscope.say();
        Beanscope beanscope1 = super.getBean("beanscope");
        beanscope1.say();
    }

    @Test
    public void test1(){
        Beanscope beanscope = super.getBean("beanscope1");

        beanscope.say();

        Beanscope beanscope1 = super.getBean("beanscope1");

        beanscope1.say();
    }


}
