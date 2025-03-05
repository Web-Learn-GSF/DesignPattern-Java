package com.example.行为型模式.访问者模式;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}