package com.example.结构型模式.适配器模式.组合适配器;

public class IPhoneHeadSet implements IPhoneInterface{
    @Override
    public void iphoneHeadSet() {
        System.out.println("这里是使用lightning接口耳机的连接");
    }
}