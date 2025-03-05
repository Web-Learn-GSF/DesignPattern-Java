package com.example.创建型模式.工厂模式.工厂方法;

public class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("用苹果手机打电话！");
    }
}
