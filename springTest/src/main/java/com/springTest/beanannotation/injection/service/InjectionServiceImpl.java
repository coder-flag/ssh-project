package com.springTest.beanannotation.injection.service;

import com.springTest.beanannotation.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 20:50 2018/11/30
 * @Modified By:
 **/

@Service
public class InjectionServiceImpl implements InjectionService {

//    @Autowired
    private InjectionDao injectionDao;

    //构造方法注入
//    @Autowired
//    public InjectionServiceImpl(InjectionDao injectionDao){
//        this.injectionDao = injectionDao;
//        System.out.println("cons........");
//    }

    //通过set注入
//    @Autowired
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
        System.out.println("setter........");
    }




    @Override
    public void save(String arg) {
        System.out.println("service 接收参数："+ arg);

        arg = arg + injectionDao.hashCode();

        injectionDao.save(arg);
    }
}
