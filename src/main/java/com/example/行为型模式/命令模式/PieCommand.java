package com.example.行为型模式.命令模式;

/**
 * 做馅饼的命令
 */
public class PieCommand implements Command{

    /**
     * 持有真正实现命令的接收者--后厨对象
     */
    private Kitchen kitchen;

    public PieCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.pie();
    }
}
