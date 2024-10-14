package com.javaacademy.onegramchat.chat;

import com.javaacademy.onegramchat.user.User;

import java.util.ArrayList;

import static com.javaacademy.onegramchat.chat.ChatConstants.*;
import static com.javaacademy.onegramchat.chat.ChatUtil.*;

public class CreateUser {

    /**
     * Создание пользователя
     */
    protected static void createUser(ArrayList<User> usersList) {
        String name = askUserName();
        String password = askUserPassword();
        User user = new User(name, password);
        usersList.add(user);
        print(name, USER_CREATE);
        print(DELIMITER);
    }
}
