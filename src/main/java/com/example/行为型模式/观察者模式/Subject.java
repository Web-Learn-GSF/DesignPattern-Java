package com.example.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

//主题者对象
class Subject{
    //保存观察者的容器
    private List<Observer> container = new ArrayList<>();
 
    //添加观察者
    public void addObserver(Observer observer){
        container.add(observer);
    }
 
    //删除观察者
    public void remove(Observer observer){
        container.remove(observer);
    }
 
    //更新通知
    public void notifyObserver(Object object){
        //将更新消息通知到每一个观察者
        for(Observer item:container){
            item.update(object);
        }
    }
}