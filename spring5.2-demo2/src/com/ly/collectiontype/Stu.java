package com.ly.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1.数组类型属性
    private String[] course;
   //2.list集合类型属性
    private List<String> list;
    //3.创建Map集合类型属性
    private Map<String,String> maps;
    //4.set集合类型的属性
    //学生所学的多门课程

    private List<Course> coursesList;
    public void setCoursesList(List<Course> coursesList){
        this.coursesList=coursesList;
    }
    private Set<String> sets;
    public void setSets(Set<String> sets){
        this.sets=sets;
    }
    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
    public void test(){
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(coursesList);
    }
}
