package com.springTest.beanannotation.javabased;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 11:06 2018/12/17
 * @Modified By:
 **/
public class getStoreConfig implements Store {
    @Override
    public void destory() {
        System.out.println("init");
    }

    @Override
    public void init() {
        System.out.println("destory");
    }


}
