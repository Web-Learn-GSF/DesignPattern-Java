package com.example.结构型模式.装饰器模式;

/**
 * Created on 2020/3/19
 * Package com.design_pattern.decorator
 *
 * @author dsy
 */
public class EggDecorator extends NoodlesDecorator {

    public EggDecorator(INoodles noodles) {
        super(noodles);
    }

    /**
     * 重写父类的cook方法，并添加自己的实现，调用父类的cook方法，此cook方法是通过本类的构造器
     * EggDecorator(INoodles noodles)传入的noodles的cook操作
     */
    @Override
    public void cook() {
        System.out.println("加了一个荷包蛋");
        super.cook();
    }
}


