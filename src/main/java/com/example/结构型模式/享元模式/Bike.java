package com.example.结构型模式.享元模式;

/**
 * @author Created by njy on 2023/6/21
 * 1.抽象享元类（FlyWeight）：单车
 * 单车有很多共同的信息比如：价格、颜色
 */
public abstract class Bike {
 
    protected String color;
 
    protected int price;
 
    public Bike(String color,int price){
        this.color=color;
        this.price=price;
    }
 
    //展示单车信息
    public abstract void show();
 
}