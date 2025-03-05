package com.example.结构型模式.代理模式.动态代理.JDK动态代理;

import junit.framework.TestCase;

import java.lang.reflect.Proxy;

public class LogProxyTest extends TestCase {
    public static void main(String[] args) {
        Tank tank = new Tank();
        // reflection 反射 通过二进制字节码分析类的属性和方法

        //newProxyInstance: 创建代理对象
        // 参数一: 类加载器
        // 参数二：接口类对象  被代理对象所实现的接口
        // 参数三：调用处理器。 被调用对象的那个方法被调用后该如何处理
        Movable o = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader()
                ,new Class[]{Movable.class}
                ,new LogProxy(tank));
        o.move();
    }
}