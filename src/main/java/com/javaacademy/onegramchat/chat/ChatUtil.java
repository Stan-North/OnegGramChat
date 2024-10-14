package com.javaacademy.onegramchat.chat;

import static com.javaacademy.onegramchat.chat.ChatConstants.*;

public class ChatUtil {

    /**
     * обертка printf
     */
    protected static void printFormatted(String template, String text) {
        System.out.printf(template, text);
    }

    /**
     * обертка printf
     */
    protected static void printFormatted(String template, String text1, String text2) {
        System.out.printf(template, text1, text2);
    }

    /**
     * обертка println
     */
    protected static void print(String text) {
        System.out.println(text);
    }

    /**
     * обертка println
     */
    protected static void print(String text1, String text2) {
        System.out.println(text1 + " " +  text2);
    }

    /**
     * обертка nextLine
     */
    protected static final String input() {
        return scanner.nextLine();
    }

    /**
     * Считывание ответа на запрос системой имени пользователя
     */
    protected static String askUserName() {
        print(ENTER_USER_NAME);
        return input();
    }

    /**
     * Считывание ответа на запрос системой пароля пользователя
     */
    protected static String askUserPassword() {
        print(ENTER_USER_PASSWORD);
        return input();
    }

    /**
     * Запрос у пользователя имени адресата
     */
    protected static String askNameUserForLetter() {
        print(RECIPIENT_USER);
        return input();
    }

    /**
     * Запрос у пользователя текста сообщения
     */
    protected static String askTextForLetter() {
        print(RECIPIENT_LETTER);
        return input();
    }
}
