package com.ly.test;

import com.ly.entity.Book;
import com.ly.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        List<Book> bookList = bookService.findAll();
        System.out.println(bookList);

    }
}
