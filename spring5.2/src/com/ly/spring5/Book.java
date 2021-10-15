package com.ly.spring5;

/**
 *演示使用set方法进行属性的注入
 */
public class Book{
   //创建属性
    private String bname;
    private  String bauthor;
    private String address;
    //创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }
    public void setBauthor(String bauthor){
        this.bauthor=bauthor;
    }
    public void setAddress(String address){
        this.address=address;
    }

public void testDemo(){
    System.out.println("bname"+"::"+bname);
    System.out.println("bauthor"+"::"+bauthor);
    System.out.println("address"+"::"+address);
}



//      //有参数构造注入
//    public Book(String bname){
//        this.bname=bname;
//    }
//    public static void main(String[] args) {
////        Book book =new Book();
////        book.setBname("abc");
//        Book book=new Book("abc");
//    }

}
