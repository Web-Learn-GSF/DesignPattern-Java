package com.example.行为型模式.备忘录模式;

import junit.framework.TestCase;

public class GameRoleTest extends TestCase {
    public static void main(String[] args) {

        //创建对象
        GameRole gameRole = new GameRole();
        gameRole.setName("安琪拉");
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.print("【战前状态】");
        gameRole.display();

        //把当前状态保存到备忘录对象 Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        //对象状态改变
        gameRole.setName("安琪拉");
        gameRole.setDef(50);
        gameRole.setVit(60);

        System.out.print("【战后状态】");
        gameRole.display();

        //备忘录对象恢复之前对象状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        System.out.print("【恢复状态】");
        gameRole.display();

    }
}