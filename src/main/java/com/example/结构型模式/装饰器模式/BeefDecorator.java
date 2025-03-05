package com.example.结构型模式.装饰器模式;

/**
 * Created on 2020/3/19
 * Package com.design_pattern.decorator
 *
 * @author dsy
 */
public class BeefDecorator extends NoodlesDecorator {

    public BeefDecorator(INoodles noodles) {
        super(noodles);
    }

    @Override
    public void cook() {
        System.out.println("加了一斤牛肉");
        super.cook();
    }
}

