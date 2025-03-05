package com.example.结构型模式.组合模式;

import junit.framework.TestCase;

public class CompositeTest extends TestCase {
    public static void main(String[] args) {
        // 创建叶子节点
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        // 创建组合节点
        Composite composite1 = new Composite("Composite 1");
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite("Composite 2");
        composite2.add(leaf3);
        composite2.add(composite1); // 组合中包含另一个组合

        // 输出结构
        composite2.show();
    }
}