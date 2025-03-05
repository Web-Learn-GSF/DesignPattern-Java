package com.example.创建型模式.工厂模式.抽象工厂;

public class OtherFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Book createBook() {
        return new MiBook();
    }
}
