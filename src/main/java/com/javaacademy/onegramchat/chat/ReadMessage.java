package com.javaacademy.onegramchat.chat;

import com.javaacademy.onegramchat.message.Message;
import com.javaacademy.onegramchat.message.MessageType;
import com.javaacademy.onegramchat.user.User;

import java.util.ArrayList;

import static com.javaacademy.onegramchat.chat.ChatConstants.*;
import static com.javaacademy.onegramchat.chat.ChatUtil.*;

public class ReadMessage {
    /**
     * Чтение и вывод в консоль всех сообщений пользователя
     */
    protected static void readMessages(User currentUser) {
        if (currentUser == null) {
            throw new RuntimeException(USER_IS_NOT_LOGGED_IN);
        }
        printIncomingMessage(currentUser);
        printOutgoingMessage(currentUser);
        print(DELIMITER);
    }

    /**
     * Печать в консоль всех входящих сообщений пользователя
     */
    private static void printIncomingMessage(User currentUser) {
        ArrayList<Message> messages = currentUser.getMessages().get(MessageType.INCOMING);
        if (messages.isEmpty()) {
            printFormatted(USER_HAS_NO_EMAIL, MessageType.INCOMING.getType());
        } else {
            messages.forEach(message -> printFormatted(
                    INCOMING_PATTERN, message.getSender().getName(), message.getText()));
        }
    }

    /**
     * Печать в консоль всех исходящих сообщений пользователя
     */
    private static void printOutgoingMessage(User currentUser) {
        ArrayList<Message> messages = currentUser.getMessages().get(MessageType.OUTGOING);
        if (messages.isEmpty()) {
            printFormatted(USER_HAS_NO_EMAIL, MessageType.OUTGOING.getType());
        } else {
            messages.forEach(message -> printFormatted(
                    OUTGOING_PATTERN, message.getRecipient().getName(), message.getText()));
        }
    }
}
