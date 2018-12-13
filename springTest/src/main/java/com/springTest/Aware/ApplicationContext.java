package com.springTest.Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:45 2018/12/3
 * @Modified By:
 **/
public class ApplicationContext implements ApplicationContextAware {

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext:" + applicationContext.getBean("applicationContext").hashCode());

    }
}
