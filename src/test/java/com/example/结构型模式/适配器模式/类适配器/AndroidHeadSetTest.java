package com.example.结构型模式.适配器模式.类适配器;

import junit.framework.TestCase;

public class AndroidHeadSetTest extends TestCase {
    public static void main(String[] args) {
        // 直接通过苹果接口 使用苹果耳机
        IPhoneInterface iPhoneInterface = new IPhoneHeadSet();
        iPhoneInterface.iphoneHeadSet();

        //通过类的适配器进行连接
        HeadSetAdapter headSetAdapter = new HeadSetAdapter();
        headSetAdapter.iphoneHeadSet();
    }
}