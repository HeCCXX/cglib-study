package com.hcx.statics;

import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyMain
 * @Description 静态代理main方法
 * @Author 贺楚翔
 * @Date 2020-03-30 13:47
 * @Version 1.0
 **/
public class ProxyMain {
    public static void main(String[] args) {
        Person person = new PersonImpl();

        //将person类传到静态代理类中
        StaticProxy staticProxy = new StaticProxy(person);

        //通过访问静态代理类的sayPerson方法调用person类的方法
        staticProxy.sayPerson();
    }
}
