package com.ly.spring5.testdemo;

import com.ly.spring5.Book;
import com.ly.spring5.Orders;
import com.ly.spring5.User;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Map;

public class testAdd {
    @Test
    public void testAdd() {
        //加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置文件创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook1() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders(){
        //1.加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Orders orders=context.getBean("orders",Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
