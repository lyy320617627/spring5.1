package com.ly.test;

import com.ly.entity.Book;
import com.ly.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService=context.getBean("bookService",BookService.class);
        Book book =new Book();
        book.setUserId("3");
        book.setUsername("哈利波特");
        book.setUstatus("a");
        bookService.addBook(book);
    }
}
