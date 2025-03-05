package com.example.创建型模式.工厂模式.工厂方法;

import junit.framework.TestCase;

public class PhoneTest extends TestCase {
    public static void main(String[] args) {
        // 生产小米手机
        PhoneFactory factory1 = new MPhoneFactory();
        factory1.create().call();

        // 生产苹果手机
        PhoneFactory factory2 = new IPhoneFactory();
        factory2.create().call();

    }
}