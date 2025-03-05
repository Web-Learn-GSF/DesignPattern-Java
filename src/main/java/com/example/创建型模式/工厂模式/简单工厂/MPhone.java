package com.example.创建型模式.工厂模式.简单工厂;

public class MPhone implements Phone{
    @Override
    public void call() {
        System.out.println("用小米手机打电话！");
    }
}
