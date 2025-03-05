package com.example.结构型模式.桥接模式;

import junit.framework.TestCase;

public class CircleTest extends TestCase {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}