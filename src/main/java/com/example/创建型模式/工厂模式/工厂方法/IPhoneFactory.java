package com.example.创建型模式.工厂模式.工厂方法;


public class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        return new IPhone();
    }
}
