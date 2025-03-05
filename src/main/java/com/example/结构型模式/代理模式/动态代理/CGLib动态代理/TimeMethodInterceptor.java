package com.example.结构型模式.代理模式.动态代理.CGLib动态代理;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class TimeMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param o，生成的子类
     * @param method，被代理的方法
     * @param objects，参数
     * @param methodProxy，代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("生成的类名"+o.getClass().getName());
        System.out.println("生成的类的父类"+o.getClass().getSuperclass().getName());
        System.out.println("方法执行前，被代理的方法"+method.getName());
        Object result = null;
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后，被代理的方法"+method.getName());
        return result;
    }
}