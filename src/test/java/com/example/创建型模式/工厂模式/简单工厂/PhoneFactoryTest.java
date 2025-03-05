package com.example.创建型模式.工厂模式.简单工厂;

import junit.framework.TestCase;

public class PhoneFactoryTest extends TestCase {

    public static final String IPhone = "IPhone";

    public static final String MPhone = "MPhone";

    public static void main(String[] args) {
        // 生产小米手机
        PhoneFactory factory1 = new PhoneFactory();
        factory1.create(MPhone).call();

        // 生产苹果手机
        PhoneFactory factory2 = new PhoneFactory();
        factory2.create(IPhone).call();
    }
}