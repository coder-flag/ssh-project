package com.springTest.controller;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 11:24 2018/11/30
 * @Modified By:
 **/
public class helloworld {

    String name ;

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello"+ name);
    }

}
