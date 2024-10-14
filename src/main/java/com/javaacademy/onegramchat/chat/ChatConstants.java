package com.javaacademy.onegramchat.chat;

import java.util.Scanner;

public class ChatConstants {
    protected static final String ENTER_USER_NAME = "Введите имя пользователя";
    protected static final String ENTER_USER_PASSWORD = "Введите пароль";
    protected static final String USER_LOGGED_IN = "Пользователь авторизован";
    protected static final String USER_CREATE = "Пользователь создан";
    protected static final String USER_LOG_OUT = "Пользователь %s вышел из OneGramChat\n";
    protected static final String USER_DO_NOT_EXIST_ERROR = "Такого пользователя нет";
    protected static final String USER_IS_NOT_LOGGED_IN = "Вы не авторизованы";
    protected static final String RECIPIENT_USER = "Введите имя адресата";
    protected static final String RECIPIENT_LETTER = "Введите текст письма";
    protected static final String USER_SENT_EMAIL = "Вы отправили письмо адресату %s\n";
    protected static final String USER_HAS_NO_EMAIL = "У вас нет писем с типом %s\n";
    protected static final String INCOMING_PATTERN = "Письмо от %s: %s\n";
    protected static final String OUTGOING_PATTERN = "Письмо к %s: %s\n";
    protected static final String CHAT_GREETING =
            "Вас приветствует OneGramChat!\nВведите команду что вы хотите сделать:";
    protected static final String CHAT_GREETING_LOG_IN_USER =
            "Вы вошли в OneGramChat как %s!\nВведите команду что вы хотите сделать:\n";
    protected static final String CHAT_EXIT_MESSAGE =
            "До встречи в OneGramChat!\nПрограмма закончила работу";
    protected static final String CHAT_COMMAND_LOG_IN = "войти";
    protected static final String CHAT_COMMAND_CREATE_USER = "новый";
    protected static final String CHAT_COMMAND_LOG_OUT = "выйти";
    protected static final String CHAT_COMMAND_WRITE = "написать";
    protected static final String CHAT_COMMAND_READ = "прочитать";
    protected static final String CHAT_COMMAND_EXIT = "exit";
    protected static final String CHAT_ALL_COMMAND = CHAT_COMMAND_CREATE_USER + " * " + CHAT_COMMAND_LOG_IN
            + " * " + CHAT_COMMAND_WRITE + " * " + CHAT_COMMAND_READ
            + " * " + CHAT_COMMAND_LOG_OUT + " * " + CHAT_COMMAND_EXIT;

    protected static final String DELIMITER = "==========================";
    protected static final Scanner scanner = new Scanner(System.in);
}
