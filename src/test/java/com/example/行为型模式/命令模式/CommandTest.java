package com.example.行为型模式.命令模式;

import junit.framework.TestCase;

public class CommandTest extends TestCase {
    public static void main(String[] args) {
        // 创建后厨对象
        Kitchen kitchen = new Kitchen();

        // 创建做面和做馅饼的命令对象
        NoodleCommand noodleCommand = new NoodleCommand(kitchen);
        PieCommand pieCommand = new PieCommand(kitchen);
        IceCommond iceCommond = new IceCommond(kitchen);

        // 创建一个服务员对象
        Waiter waiter = new Waiter();
        // 服务员手拿无线点菜机，设置有做面条和做馅饼命令触发按钮
        waiter.setNoodleCommand(noodleCommand);
        waiter.setPieCommand(pieCommand);
        waiter.setIceCommond(iceCommond);

        // 客人A：服务员您好，我想来碗面
        waiter.noodleCommandExecute();
        // 客人B：服务员您好，我要来个馅饼
        waiter.pieCommandExecute();
        // 客人C：服务员您好，给我来碗面
        waiter.noodleCommandExecute();
        // 客人D：来一碗冰淇淋
        waiter.IceCommondExecute();


    }

}