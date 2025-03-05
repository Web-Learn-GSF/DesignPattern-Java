package com.example.创建型模式.单例模式;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.show();
    }
}