package com.example.结构型模式.适配器模式.组合适配器;

public class ObjectHeadSetAdapter implements IPhoneInterface {

    private AndroidInterface androidInterface;

    public ObjectHeadSetAdapter(AndroidInterface androidInterface) {
        this.androidInterface = androidInterface;
    }

    @Override
    public void iphoneHeadSet() {
        androidInterface.androidHeadSet();
    }
}