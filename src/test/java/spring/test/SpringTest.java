package spring.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhl.spring.test.HelloWorld;
import com.zhl.spring.test.aop.service.AopService;
import com.zhl.spring.test.controller.UserController;
import com.zhl.spring.test.service.UserService;

public class SpringTest
{

//    @Test
    public void testHelloWord(){
     // TODO Auto-generated method stub
        //1. 创建Spring 的IOC容器  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        //2. 从容器中获取 Bean 其实就是new 的过程  
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");  
        // 也可以是 HelloWorld helloWorld = ctx.getBean(HelloWorld.class);  
          
        //3. 执行函数  
        helloWorld.helloWorld();  
    }
    
    /**
     * 获取数据源
    * @Title: getC3p0Connection
    * @Description: TODO()
    * @author ZhongHanlin
    * @throws SQLException
    * @throws
     */
//    @Test
    public void getConnection() throws SQLException{  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");  
        System.out.println(dataSource.getConnection());  
    }
    
    /**
     * 注解
    * @Title: annotation
    * @Description: TODO()
    * @author ZhongHanlin
    * @throws
     */
//    @Test
    public void annotation(){  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        UserService userService = (UserService) ctx.getBean("userService");  
        userService.getService();  
        UserController userController = (UserController) ctx.getBean("userController");  
        userController.getController();  
    }  
    
    /**
     * aop
    * @Title: aopTest
    * @Description: TODO()
    * @author ZhongHanlin
    * @throws
     */
    @Test  
    public void aopTest(){  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        AopService aopService = (AopService) ctx.getBean("aopService");  
        aopService.login();  
        aopService.writeABlog();  
        aopService.deleteABlog();  
        aopService.loginOut();  
    }  
}
