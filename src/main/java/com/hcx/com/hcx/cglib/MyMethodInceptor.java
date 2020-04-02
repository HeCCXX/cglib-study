package com.hcx.com.hcx.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName MyMethodInceptor
 * @Description cglib 动态代理
 * @Author 贺楚翔
 * @Date 2020-04-01 13:58
 * @Version 1.0
 **/
public class MyMethodInceptor implements MethodInterceptor {
    private Person person;

    public MyMethodInceptor(Person person) {
        this.person = person;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("动态代理方法进入。。。");
        return methodProxy.invoke(person,objects);
    }

//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("动态代理方法进入。。。");
//        return methodProxy.invokeSuper(o,objects);
//    }


}
