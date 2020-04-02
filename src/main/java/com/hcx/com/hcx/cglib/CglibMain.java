package com.hcx.com.hcx.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName CglibMain
 * @Description cglib  主函数类
 * @Author 贺楚翔
 * @Date 2020-04-01 14:06
 * @Version 1.0
 **/
public class CglibMain {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Person.class);
//        enhancer.setCallback(new MyMethodInceptor());
//        Person student = (Person) enhancer.create();
//        student.sayStudent();


        Person person = new Person();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new MyMethodInceptor(person));
        Person student = (Person) enhancer.create();
        student.sayStudent();


    }
}
