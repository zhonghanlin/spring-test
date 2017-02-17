package com.zhl.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhl.spring.test.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public void getService(){  
        System.out.print("这是service层,调用Repository方法 : "); 
        userRepository.findUser();
        
    }  
}
