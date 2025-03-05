package com.example.结构型模式.代理模式.动态代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LogProxy implements InvocationHandler {
    private Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法:"+method.getName()+"()执行前");
        Object invoke = method.invoke(movable, args);  // 此处相当于 movable.move()
        System.out.println("方法:"+method.getName()+"()执行后");
        return invoke;
    }
}