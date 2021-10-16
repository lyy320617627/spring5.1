package com.ly.service;

import com.ly.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
//UserService----userService
@Service(value = "userService") //<bean id="userService" class="...">
public class UserService {
    //定义属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired//根据类型进行注入
      private UserDao userDao;
    public void add(){
        System.out.println("service addd.....");
        userDao.add();
    }
}
