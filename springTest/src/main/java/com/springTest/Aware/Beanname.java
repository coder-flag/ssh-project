package com.springTest.Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:46 2018/12/3
 * @Modified By:
 **/
public class Beanname implements BeanNameAware , ApplicationContextAware {

    private String  beanname ;

    @Override
    public void setBeanName(String s) {
        this.beanname = s;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("beanname:" + applicationContext.getBean(this.beanname).hashCode());
    }


}
