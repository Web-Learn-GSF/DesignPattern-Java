package com.example.结构型模式.代理模式.动态代理.JDK动态代理;

import java.lang.reflect.Proxy;

public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving cla....");
    }
}