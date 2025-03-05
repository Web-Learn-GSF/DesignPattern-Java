package com.example.结构型模式.装饰器模式;

import junit.framework.TestCase;

public class NoodlesTest extends TestCase {
    public static void main(String[] args) {

        //一位老板来了说我全要
        INoodles noodles = new Noodles();
        INoodles noodlesWithEgg = new EggDecorator(noodles);
        INoodles noodlesWithEggAndChickenLeg = new ChickenLegDecorator(noodlesWithEgg);
        INoodles noodlesWithEggAndChickenLegAndBeef = new BeefDecorator(noodlesWithEggAndChickenLeg);
        noodlesWithEggAndChickenLegAndBeef.cook();
        System.out.println("************分割线**************");
        //咱是程序员，咱加一个蛋就行了
        INoodles noodles1 = new Noodles();
        INoodles noodles1WithEgg = new EggDecorator(noodles1);
        noodles1WithEgg.cook();
    }
}