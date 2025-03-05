package com.example.结构型模式.装饰器模式;

/**
 * Created on 2020/3/19
 * Package com.design_pattern.decorator
 *
 * @author dsy
 */
public abstract class NoodlesDecorator implements INoodles {

    private INoodles noodles;    //添加一个INoodles 的引用

    public NoodlesDecorator(INoodles noodles){     //通过构造器来设置INoodles 
        this.noodles = noodles;
    }

    @Override
    public void cook() {
        if (noodles!=null){
            noodles.cook();
        }
    }

}

