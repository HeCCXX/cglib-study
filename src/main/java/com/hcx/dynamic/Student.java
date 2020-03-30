package com.hcx.dynamic;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-30 13:53
 * @Version 1.0
 **/
public class Student implements Person{
    @Override
    public void sayPerson() {
        System.out.println("我是学生，实现了Person类。。。");
    }
}
