package com.example.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void show() {
        System.out.println("Composite: " + name);
        for (Component component : children) {
            component.show();
        }
    }
}