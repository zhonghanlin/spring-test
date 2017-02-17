package com.zhl.spring.test.aop.service;

import org.springframework.stereotype.Service;

@Service
public class AopService
{
    // 用户登入  
    public void login(){  
        System.out.println("登入成功");  
    }  
      
    // 用户退出  
    public void loginOut(){  
        System.out.println("用户退出系统");  
    }  
      
    // 用户操作  
    public void writeABlog(){  
        System.out.println("用户编写博客");  
    }  
      
    // 用户操作  
    public void deleteABlog(){  
        System.out.println("用户删除博客");  
    }  
}
