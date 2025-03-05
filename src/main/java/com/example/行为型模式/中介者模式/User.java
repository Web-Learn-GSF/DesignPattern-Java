package com.example.行为型模式.中介者模式;

import lombok.Getter;

// 同事类：用户
public class User {
    @Getter
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.registerUser(this);
    }

    public void sendMessage(String message) {
        chatRoom.broadcastMessage(this, name + ": " + message);
    }

    public void receiveMessage(User sender, String message) {
        System.out.println(sender.getName() + " says: " + message);
    }

}