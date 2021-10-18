package com.ly.dao;

import com.ly.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //添加方法
    @Override
    public void add(Book book) {
        //创建sql语句
        String sql="insert into t_book values(?,?,?)";
        //2.调用方法实现
        Object[] args={book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
    //修改
    @Override
    public void updateBook(Book book) {
        String sql="update t_book set username=?,ustatus=?where user_id=?";
        Object[] args={book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
     //删除
    @Override
    public void delete(String id) {
      String sql="delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }
}
