package com.example.行为型模式.观察者模式;

//定义一个观察者实体
class Task1 implements Observer{
    @Override
    public void update(Object object) {
        System.out.println("task1 received: "+object);
    }
}