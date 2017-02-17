package com.zhl.spring.test.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository
{

    public void findUser() {  
        System.out.println("这是通过注解配置bean属性的案例");  
    }  
}
