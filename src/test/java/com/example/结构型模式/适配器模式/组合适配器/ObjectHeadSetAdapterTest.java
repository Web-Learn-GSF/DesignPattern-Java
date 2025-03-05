package com.example.结构型模式.适配器模式.组合适配器;

import com.example.结构型模式.适配器模式.类适配器.HeadSetAdapter;
import junit.framework.TestCase;

public class ObjectHeadSetAdapterTest extends TestCase {
    public static void main(String[] args) {
        // 直接通过苹果接口 使用苹果耳机
        IPhoneInterface iPhoneInterface = new IPhoneHeadSet();
        iPhoneInterface.iphoneHeadSet();

        //通过类的适配器进行连接
        HeadSetAdapter headSetAdapter = new HeadSetAdapter();
        headSetAdapter.iphoneHeadSet();

        //通过对象的适配器进行连接
        AndroidInterface androidInterface = new AndroidHeadSet();
        ObjectHeadSetAdapter objectHeadSetAdapter = new ObjectHeadSetAdapter(androidInterface);
        objectHeadSetAdapter.iphoneHeadSet();
    }
}