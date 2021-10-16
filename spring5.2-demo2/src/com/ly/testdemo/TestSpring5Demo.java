package com.ly.testdemo;

import com.ly.bean.Orders;
import com.ly.collectiontype.Book;
import com.ly.collectiontype.Course;
import com.ly.collectiontype.Stu;
import com.ly.factorybean.MyBean;
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
   @Test
   public void testCollection2(){
      ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
      Book book1 = context.getBean("book", Book.class);
      Book book2 = context.getBean("book", Book.class);
//      book.showList();
      System.out.println(book1);
      System.out.println(book2);
   }
   @Test
   public void test3(){
      ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
      Course course = context.getBean("myBean", Course.class);
      System.out.println(course);
   }
   @Test
   public void test4(){
      ApplicationContext context =new ClassPathXmlApplicationContext("bean4.xml");
      Orders orders = context.getBean("orders", Orders.class);
      //第四步，获取创建bean实例的对象
      System.out.println(orders);
      //手动让bean实例销毁
      ((ClassPathXmlApplicationContext) context).close();
   }
}
