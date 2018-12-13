package com.springTest.beanannotation.mulitbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:58 2018/12/13
 * @Modified By:
 **/
@Component
public class Beaninvoke {

    @Autowired
    private List<beaninterface> list;

    @Autowired
    private Map<String,beaninterface> map;

    public  void say(){

        System.out.println("list....");
        if(null != list && 0!= list.size()){
            for(beaninterface list1 : list){
                System.out.println(list1.getClass().getName());
            }
        }



        if(null !=map && 0!= map.size()){
            System.out.println("map......");
            for(Map.Entry<String,beaninterface> entry: map.entrySet()){

                System.out.println(entry.getValue().getClass().getName());
            }
        }
    }


}
