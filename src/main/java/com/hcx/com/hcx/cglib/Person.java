package com.hcx.com.hcx.cglib;

/**
 * @ClassName Person
 * @Description cglib  person类  未实现接口，单独实体类
 * @Author 贺楚翔
 * @Date 2020-03-30 14:13
 * @Version 1.0
 **/
public class Person {

    public void sayStudent(){
        System.out.println("这是Person类中的学生...");
        sayTeacher();
    }

    public void sayTeacher(){
        System.out.println("这是Person类中的老师...");
    }
}
