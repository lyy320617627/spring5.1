package com.ly.aopanno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强的类
 */
@Component
@Aspect //生成代理对象
@Order(1)
public class UserProxy {
    //相同切入点进行抽取
    @Pointcut(value = "execution(* com.ly.aopanno.User.add(..))")
    public void pointdemo(){

    }
    //前置通知
    //@Before注解表示作为前置通知，使用切入点表达是
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before......");
    }
    @AfterReturning(value = "execution(* com.ly.aopanno.User.add(..))")
    public void afterReturing(){
        System.out.println("afterReturing.......");
    }
    @AfterThrowing(value = "execution(* com.ly.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
    @After(value = "execution(* com.ly.aopanno.User.add(..))")
    public void after(){
        System.out.println("after...........");
    }
      //环绕通知
    @Around(value = "execution(* com.ly.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        System.out.println("aroud之前......");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
