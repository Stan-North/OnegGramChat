package com.javaacademy.onegramchat.chat;

import com.javaacademy.onegramchat.message.Message;
import com.javaacademy.onegramchat.message.MessageType;
import com.javaacademy.onegramchat.user.User;

import java.util.ArrayList;

import static com.javaacademy.onegramchat.chat.ChatConstants.*;
import static com.javaacademy.onegramchat.chat.ChatUtil.*;
import static com.javaacademy.onegramchat.chat.ChatUtil.askNameUserForLetter;
import static com.javaacademy.onegramchat.chat.ChatUtil.askTextForLetter;

public class WriteMessage {

    /**
     * Запись сообщения текущему пользователю
     */
    private static void writeMessageToCurrentUser(Message message, User currentUser) {
        currentUser
                .getMessages()
                .get(MessageType.OUTGOING)
                .add(message);
    }

    /**
     * Поиск получателя сообщения
     */
    private static User findRecipientUser(String name, ArrayList<User> usersList) {
        return usersList
                .stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(USER_DO_NOT_EXIST_ERROR));
    }

    /**
     * Запись сообщения получателю
     */
    private static void writeMessageToRecipientUser(String nameUser, ArrayList<User> usersList, Message message) {
        findRecipientUser(nameUser, usersList)
                .getMessages()
                .get(MessageType.INCOMING)
                .add(message);
    }

    /**
     * Запись полученных имени адресата и письма в исходящие и исходящие сообщения
     */
    protected static void writeLetter(User currentUser, ArrayList<User> usersList) {
        if (currentUser == null) {
            throw new RuntimeException(USER_IS_NOT_LOGGED_IN);
        }
        String recipient = askNameUserForLetter();
        String letter = askTextForLetter();
        Message message = new Message(letter, currentUser, findRecipientUser(recipient, usersList));
        writeMessageToCurrentUser(message, currentUser);
        writeMessageToRecipientUser(recipient, usersList, message);
        printFormatted(USER_SENT_EMAIL, recipient);
        print(DELIMITER);
    }
}
