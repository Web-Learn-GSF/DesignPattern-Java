package com.example.行为型模式.访问者模式;

import junit.framework.TestCase;

public class ComputerPartDisplayVisitorTest extends TestCase {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}