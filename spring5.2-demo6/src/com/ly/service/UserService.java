package com.ly.service;

import com.ly.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,timeout = 5,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)//可以加到类上面，也可以加到方法上面
public class UserService {
//注入Dao
    @Autowired
    private UserDao userDao;

    //第一步 开启事务

    //第二步：进行业务操作

    //转账的方法
    public void accountMoney(){
//      try {
          //lucy少100
          userDao.reduceMoney();
          int i=10/0;
          //mary多100
          userDao.addMoney();
          //如果没有异常，提交事务

//      }catch (Exception e){
          //出现异常，事务回滚

//      }
    }
}
