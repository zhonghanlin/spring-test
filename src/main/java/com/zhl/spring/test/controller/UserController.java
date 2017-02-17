package com.zhl.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhl.spring.test.service.UserService;

@Controller
public class UserController
{
    @Autowired  
    private UserService userService;  

    @RequestMapping("/user")
    @ResponseBody
    public String getController(){  
        System.out.print("这是controller层,调用service方法 : ");  
        userService.getService(); 
        return "success";
    }  
}
