package com.hcx.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-30 13:59
 * @Version 1.0
 **/
public class MyInvocationHandler<T> implements InvocationHandler {
    T target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }

    /**
    *
    * @param proxy 代表动态代理对象
    * @param method 代表执行的方法
    * @param args   代表执行方法的参数
    * @return java.lang.Object
    * @exception
    **/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行"+method.getName()+"方法");
        Object result = method.invoke(target, args);
        return result;
    }
}
