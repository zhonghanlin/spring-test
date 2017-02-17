package com.zhl.spring.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component  
@Aspect
public class LogAspect
{
    @After("execution(public void com.zhl.spring.test.aop.service.AopService.*(..))")  
    public void afterMethod(JoinPoint joinPoint) {  
        String opreate = joinPoint.getSignature().getName();  
        System.out.println("ITDragon opreate " + opreate);  
    }  
}
