package com.example.创建型模式.工厂模式.抽象工厂;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {
    public static void main(String[] args) {
        System.out.println("======== 苹果工厂生产出来的东西========");
        // 实例化苹果工厂，生产苹果手机和电脑
        Factory factory = new AppleFactory();
        factory.createBook().play();
        factory.createPhone().call();

        System.out.println("======== 小米工厂生产出来的东西========");
        // 实例化小米工厂，生产小米手机和电脑
        Factory factory1 = new XiaoMiFactory();
        factory1.createBook().play();
        factory1.createPhone().call();

        System.out.println("======== 其他工厂生产出来的东西========");
        // 代理厂商，能够生产组合商品（也就是通过组合的方式，提供一个全新的具体工厂，让不同产品间产生关联）
        OtherFactory otherFactory = new OtherFactory();
        otherFactory.createBook().play();
        otherFactory.createPhone().call();

    }
}