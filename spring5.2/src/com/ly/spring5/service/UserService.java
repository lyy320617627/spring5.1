package com.ly.spring5.service;

import com.ly.spring5.dao.UserDao;
import com.ly.spring5.dao.UserDaoImpl;

public class UserService {
    //创建UserDao类型属性，生成对应的set方法
    private  UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void add(){
        System.out.println("service add..............");
        //原始创建UserDao对象
//        UserDao userDao=new UserDaoImpl();
//        userDao.update();
        userDao.update();
    }
}
