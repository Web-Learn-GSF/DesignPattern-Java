package com.example.行为型模式.命令模式;

public class IceCommond implements Command{
    // 真正执行命令的人
    private Kitchen kitchen;

    public IceCommond(Kitchen kitchen){
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.ice();
    }
}
