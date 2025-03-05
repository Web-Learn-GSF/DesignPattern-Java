package com.example.行为型模式.命令模式;

import lombok.Data;

@Data
public class Waiter {

    /**
     * 做面条命令对象
     */
    private Command noodleCommand;

    /**
     * 做馅饼命令对象
     */
    private Command pieCommand;

    /**
     * 做冰淇淋
     */
    private IceCommond iceCommond;

    /**
     * 下达做面条的命令
     */
    public void noodleCommandExecute(){
        noodleCommand.execute();
    }

    /**
     * 下达做馅饼的命令
     */
    public void pieCommandExecute(){
        pieCommand.execute();
    }

    /**
     * 下带做冰淇淋的命令
     */
    public void IceCommondExecute() {
        iceCommond.execute();
    }
}