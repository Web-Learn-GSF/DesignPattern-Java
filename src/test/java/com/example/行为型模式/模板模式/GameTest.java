package com.example.行为型模式.模板模式;

import junit.framework.TestCase;

public class GameTest extends TestCase {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}