package com.example.结构型模式.代理模式.动态代理.CGLib动态代理;

import junit.framework.TestCase;
import org.springframework.cglib.proxy.Enhancer;

public class TimeMethodInterceptorTest extends TestCase {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer(); // 增强者
        enhancer.setSuperclass(Tank.class); // 指定父类
        enhancer.setCallback(new TimeMethodInterceptor()); // 当被代理对象的方法调用的时候会调用 该对象的intercept
        Tank tank = (Tank)enhancer.create();  // 动态代理的生成
        tank.move();  // 生成之后会调用
    }
}