package com.ly.test;

import com.ly.dao.BookDao;
import com.ly.entity.Book;
import com.ly.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService=context.getBean("bookService",BookService.class);
//        Book book =new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("atguigu");
//        bookService.updateBook(book);
//        bookService.deleteBook("2");
        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);
        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);
        //查询返回集合
//        List<Book> bookList = bookService.findAll();
//        System.out.println(bookList);
        //批量添加
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] o1={"java","a","3"};
//        Object[] o2={"c++","b","4"};
//        Object[] o3={"MySQL","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
////        //调用批量添加方法
////        bookService.batchAdd(batchArgs);
//          //批量修改
//        bookService.batchUpdate(batchArgs);
        //批量删除
        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"3"};
        Object[] o2={"4"};
        Object[] o3={"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);

    }
}
