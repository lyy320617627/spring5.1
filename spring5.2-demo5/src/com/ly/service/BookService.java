package com.ly.service;

import com.ly.dao.BookDao;
import com.ly.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;
    //添加方法
    public void addBook(Book book){
    bookDao.add(book);
    }
}
