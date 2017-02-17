package com.zhl.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhl.spring.test.service.UserService;

@Service
public class UserController
{
    @Autowired  
    private UserService userService;  

    public void getController(){  
        System.out.print("这是controller层,调用service方法 : ");  
        userService.getService();  
    }  
}
