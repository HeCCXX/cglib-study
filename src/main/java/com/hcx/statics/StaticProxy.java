package com.hcx.statics;

/**
 * @ClassName StaticProxy
 * @Description 静态代理类，实例化Person类
 * @Author 贺楚翔
 * @Date 2020-03-30 13:29
 * @Version 1.0
 **/
public class StaticProxy implements Person{

    Person person;

    public StaticProxy(Person person) {
        this.person = person;
    }

    @Override
    public void sayPerson() {
        System.out.println("代理类...");
        person.sayPerson();
    }
}
