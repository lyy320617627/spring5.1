package com.ly.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    //注入JdbcTemplate
  @Autowired
    private JdbcTemplate jdbcTemplate;
    //lucy转账100给mary
    //多钱
    @Override
    public void addMoney() {
        String sql="update t_account  set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }
   //少钱
    @Override
    public void reduceMoney() {
        String sql="update t_account  set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
