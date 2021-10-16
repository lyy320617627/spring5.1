package com.ly.testdemo;

import com.ly.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {
@Test
    public void testService(){
    ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
}
}
