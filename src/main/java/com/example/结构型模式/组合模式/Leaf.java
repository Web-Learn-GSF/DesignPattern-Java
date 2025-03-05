package com.example.结构型模式.组合模式;

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Leaf: " + name);
    }
}