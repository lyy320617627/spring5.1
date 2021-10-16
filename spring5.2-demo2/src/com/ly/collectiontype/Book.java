package com.ly.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;
    public void setList(List<String> list){
        this.list=list;
    }
    public void  showList(){
        System.out.println(list);
    }
}
