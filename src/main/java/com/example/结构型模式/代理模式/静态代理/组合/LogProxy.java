package com.example.结构型模式.代理模式.静态代理.组合;

class LogProxy implements Movable{
    private Movable movable;
    public LogProxy(Movable movable) {
        this.movable = movable;
    }
    @Override
    public void move() {
        System.out.println("方法执行前....");
        movable.move();
        System.out.println("方法执行后....");
    }
}