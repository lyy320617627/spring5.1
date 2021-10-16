package com.ly.bean;

public class Orders {
    private String oname;
    public void setOname(String oname){
        this.oname=oname;
        System.out.println("第二步 调用set方法设置属性的值");
    }
    //无参构造方法
    public Orders(){
        System.out.println("第一步 执行无参数构造创建bean实例");
    }
    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }
    //创建销毁的时候的执行的方法
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
