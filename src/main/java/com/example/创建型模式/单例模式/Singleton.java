package com.example.创建型模式.单例模式;

// 双重校验锁实现单例模式
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}

    public void show(){
        System.out.println("双重校验锁实现的单例模式");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
