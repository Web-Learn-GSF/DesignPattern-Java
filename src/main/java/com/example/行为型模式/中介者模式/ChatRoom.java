package com.example.行为型模式.中介者模式;

import java.util.ArrayList;
import java.util.List;

// 中介者：聊天室
public class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void unregisterUser(User user) {
        users.remove(user);
    }

    public void broadcastMessage(User sender, String message) {
        for (User user : users) {
            if (!user.equals(sender)) {
                user.receiveMessage(sender, message);
            }
        }
    }
}