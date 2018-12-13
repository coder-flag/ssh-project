package com.springTest.ioc.service;

import com.springTest.ioc.dao.InjectionDao;
import com.springTest.ioc.dao.InjectionDaoImpl;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 20:50 2018/11/30
 * @Modified By:
 **/
public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    //构造方法注入
    public InjectionServiceImpl(InjectionDao injectionDao){
        this.injectionDao = injectionDao;
    }

    //通过set注入
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }




    @Override
    public void save(String arg) {
        System.out.println("service 接收参数："+ arg);

        arg = arg + injectionDao.hashCode();

        injectionDao.save(arg);
    }
}
