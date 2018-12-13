package com.springTest.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 20:47 2018/11/30
 * @Modified By:
 **/

@Repository
public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }

    public  InjectionDaoImpl(){}
}
