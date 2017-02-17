package com.zhl.spring.test;

public class HelloWorld
{
    private String hello;  
    
    public void setHello(String hello) {  
        this.hello = hello;  
    }  
      
    public void helloWorld(){  
        System.out.println("Spring say :"+hello);  
    }  
}
