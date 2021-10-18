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
    //修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    //删除的方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }
}
