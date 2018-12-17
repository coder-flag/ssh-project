package com.springTest.beanannotation.javabased;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 11:12 2018/12/17
 * @Modified By:
 **/
public class MyDriverManager {

    private  String url;
    private String username;
    private String password;

    public MyDriverManager(String url,String username,String password){
        this.password =password;
        this.username =username;
        this.url =url;
    }


    public void PrintString() {
        System.out.println(url + "   " +username+  "   " + password );
    }
}
