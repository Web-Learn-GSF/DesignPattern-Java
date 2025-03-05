package com.example.结构型模式.适配器模式.类适配器;

public class HeadSetAdapter extends AndroidHeadSet implements IPhoneInterface {

	// 重写iphone耳机方法 并调用父类安卓耳机的方法，已达到适配器模式的目的
	// 解决接口不兼容不能在一起工作的问题
    @Override
    public void iphoneHeadSet() {
        super.androidHeadSet();
    }
}