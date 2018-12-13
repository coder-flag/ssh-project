package com.springTest.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:18 2018/12/12
 * @Modified By:
 **/

@Scope
//@Component("bean")
@Component
public class BeanAnnotation {
    public void  say(String arg){
        System.out.println("Annotation:"+ arg);
    }

    public  void myhash(){
        System.out.println("Annotation:"+ this.hashCode());
    }
}
