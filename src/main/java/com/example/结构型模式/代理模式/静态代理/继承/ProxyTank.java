package com.example.结构型模式.代理模式.静态代理.继承;

class ProxyTank extends Tank{
    @Override
    public void move() {
        System.out.println("方法执行前...");
        super.move();
        System.out.println("方法执行后...");
    }
}