package com.springTest.beanannotation.javabased;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 10:25 2018/12/17
 * @Modified By:
 **/
public class storeString implements Store {


    @Override
    public void destory() {
        System.out.println("This is destroy.");
    }

    public void init() {
        System.out.println("This is init.");
    }
}
