package com.example.创建型模式.工厂模式.简单工厂;

public class PhoneFactory {
    public Phone create(String type){
        if (type.equals("IPhone")){
            return new IPhone();
        }else if (type.equals("MPhone")){
            return new MPhone();
        }else
            return null;
    }
}
