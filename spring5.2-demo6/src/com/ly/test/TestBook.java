package com.ly.test;

import com.ly.config.TxConfig;
import com.ly.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

public class TestBook {
    @Nullable
    private String bookName;
    @Test
    public void testAccount(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    @Test
    public void testAccount2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    @Test
    public void testAccount3(){
        ApplicationContext context=new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
      //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext(){
        //创建GenericApplicationContext对象
        GenericApplicationContext genericApplicationContext=new AnnotationConfigApplicationContext();
        //2.调用context的方法对象注册
        genericApplicationContext.refresh();
        genericApplicationContext.registerBean("user1",User.class,()->new User());
        //3.获取在spring注册的对象
        Object bean = genericApplicationContext.getBean("user1");
        System.out.println(bean);
    }

}
