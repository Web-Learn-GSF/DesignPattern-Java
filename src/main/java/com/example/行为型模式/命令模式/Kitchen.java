package com.example.行为型模式.命令模式;

/**
 * 后厨类，接收做菜命令，真正的实现做菜功能，在Command模式中充当Receiver
 */
public class Kitchen {

    /**
     * 做面条
     */
    public void noodle(){
        System.out.println("正在做一碗美味的拉面。");
    }

    /**
     * 做馅饼
     */
    public void pie(){
        System.out.println("正在做一个香喷喷的馅饼。");
    }

    public void ice(){
        System.out.println("正在做冰淇淋");
    }
}
