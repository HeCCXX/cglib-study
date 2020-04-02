package com.hcx.dynamic;

import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicMain
 * @Description jdk 动态代理
 * @Author 贺楚翔
 * @Date 2020-03-30 14:05
 * @Version 1.0
 **/
public class DynamicMain {
    public static void main(String[] args) {
        //创建一个学生实例
        Person student = new Student();

        //创建一个与代理对象相关联的invocationHandler
        MyInvocationHandler<Person> myInvocationHandler = new MyInvocationHandler<>(student);

        //Proxy创建一个代理对象来代理student，代理对象的每个执行方法都会替换执行invocationHandler中的invoke方法
        Person o = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, myInvocationHandler);

        o.sayPerson();
    }
}
