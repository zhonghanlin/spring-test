package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhl.spring.test.HelloWorld;

public class Test
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //1. 创建Spring 的IOC容器  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");  
          
        //2. 从容器中获取 Bean 其实就是new 的过程  
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");  
        // 也可以是 HelloWorld helloWorld = ctx.getBean(HelloWorld.class);  
          
        //3. 执行函数  
        helloWorld.helloWorld();  
    }

}
