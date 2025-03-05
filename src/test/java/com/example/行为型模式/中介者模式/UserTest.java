package com.example.行为型模式.中介者模式;

import junit.framework.TestCase;

public class UserTest extends TestCase {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);

        user1.sendMessage("Hello, Bob!");
        user2.sendMessage("Hi, Alice. How are you?");
    }
}