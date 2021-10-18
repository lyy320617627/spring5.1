package com.ly.service;

import com.ly.dao.BookDao;
import com.ly.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
    //查询表中的记录数
    public int findCount(){
       return bookDao.selectCount();
    }
    //查询对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }
    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
         bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }
    //批量删除操作
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
