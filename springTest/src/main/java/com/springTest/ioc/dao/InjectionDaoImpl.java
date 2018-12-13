package com.springTest.ioc.dao;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 20:47 2018/11/30
 * @Modified By:
 **/
public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
