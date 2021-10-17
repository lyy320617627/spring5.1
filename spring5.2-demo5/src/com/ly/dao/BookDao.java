package com.ly.dao;

import com.ly.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
    //添加方法
  void add(Book book);
}
