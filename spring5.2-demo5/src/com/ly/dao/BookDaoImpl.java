package com.ly.dao;

import com.ly.entity.Book;
import com.sun.org.apache.xml.internal.security.Init;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

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
     //查询表中记录数
    @Override
    public int selectCount() {
        String sql="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql="select * from t_book where user_id=?";
        //调用jdbcTemplate模板
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBook() {
        String sql="select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql="update t_book set username=?,ustatus=?where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
    //批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql="delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }
}
