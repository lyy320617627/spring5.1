package com.ly.test;

import com.ly.service.UserService;;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//测试单元框架
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class JTest4 {
      @Autowired
    private UserService userService;
      @Test
    public void test1(){
          userService.accountMoney();
      }
}
