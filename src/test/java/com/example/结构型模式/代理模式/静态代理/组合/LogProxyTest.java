package com.example.结构型模式.代理模式.静态代理.组合;

import junit.framework.TestCase;

public class LogProxyTest extends TestCase {
    public static void main(String[] args) {
        Tank tank = new Tank();
        new LogProxy(tank).move();
    }
}