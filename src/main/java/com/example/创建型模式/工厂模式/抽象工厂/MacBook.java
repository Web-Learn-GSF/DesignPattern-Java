package com.example.创建型模式.工厂模式.抽象工厂;

public class MacBook implements Book{
    @Override
    public void play() {
        System.out.println("用苹果电脑打游戏！");
    }
}
