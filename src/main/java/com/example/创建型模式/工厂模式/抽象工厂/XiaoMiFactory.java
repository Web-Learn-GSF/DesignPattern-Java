package com.example.创建型模式.工厂模式.抽象工厂;

public class XiaoMiFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new MPhone();
    }

    @Override
    public Book createBook() {
        return new MiBook();
    }
}
