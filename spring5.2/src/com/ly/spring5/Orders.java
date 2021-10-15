package com.ly.spring5;

/**
 * 使用有参构造进行注入
 */
public class Orders {
    private String oname;
    private String address;

    /*public void setOname(String oname) {
        this.oname = oname;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/
    public Orders(String oname,String address){
        this.address=address;
        this.oname=oname;
    }
    public void ordersTest(){
        System.out.println(oname+"::"+address);
    }
}
