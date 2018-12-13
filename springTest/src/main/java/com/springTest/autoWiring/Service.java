package com.springTest.autoWiring;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 15:23 2018/12/3
 * @Modified By:
 **/
public class Service {

    private Dao dao;

//    public void setDao(Dao dao) {
//        this.dao = dao;
//        System.out.println("setdao....");
//    }

    public Service(Dao dao){
        this.dao = dao;
        System.out.println("consDao....");
    }

    public void save(String s){
       dao.save(s);
    }
}
