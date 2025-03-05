package com.example.结构型模式.适配器模式.类适配器;

public class AndroidHeadSet implements AndroidInterface {
    @Override
    public void androidHeadSet() {
        System.out.println("这里是使用安卓耳机接口的连接");
    }
}