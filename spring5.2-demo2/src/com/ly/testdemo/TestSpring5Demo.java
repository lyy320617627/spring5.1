package com.ly.testdemo;

import com.ly.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.Applet;

public class TestSpring5Demo {
   @Test
    public void  testCollection(){
       ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
       Stu stu = context.getBean("stu", Stu.class);
       stu.test();
   }
}
