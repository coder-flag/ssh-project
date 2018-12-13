package com.springTest.lifecycle;

import org.junit.Test;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:11 2018/12/3
 * @Modified By:
 **/

/**
 * bean生命周期
 * 一共有三种方法：
 * beans 里的全局default
 * bean  里的单个对象的声明
 * 实现接口
 */

public class lifecycle implements InitializingBean , DisposableBean {

    public void defaultinit(){
        System.out.println("default-init....");
    }

    public void defaultdestory(){
        System.out.println("default-destory....");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("impl-ways....destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("impl-ways....init");
    }

    public void start(){
        System.out.println("start...");
    }

    public void stop(){
        System.out.println("stop....");
    }
}
