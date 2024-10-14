package com.javaacademy.onegramchat.chat;

import com.javaacademy.onegramchat.user.User;

import java.util.ArrayList;

import static com.javaacademy.onegramchat.chat.ChatConstants.*;
import static com.javaacademy.onegramchat.chat.ChatUtil.*;
import static com.javaacademy.onegramchat.chat.CreateUser.createUser;
import static com.javaacademy.onegramchat.chat.ReadMessage.readMessages;
import static com.javaacademy.onegramchat.chat.WriteMessage.writeLetter;

public class OneGramChat {
    public ArrayList<User> usersList;
    private User currentUser;

    public OneGramChat() {
        usersList = new ArrayList<>();
    }

    /**
     * Запуск чата
     */
    public void startingTheChat() {
        String command;
        do {
            if (currentUser != null) {
                printFormatted(CHAT_GREETING_LOG_IN_USER, currentUser.getName());
            } else {
                print(CHAT_GREETING);
            }
            print(CHAT_ALL_COMMAND);
            command = input();
            doCommand(command);
        } while (!(hasCommandChoice(command)));
        scanner.close();
    }

    /**
     * Выполнение команды
     */
    private void doCommand(String command) {
        switch (command) {
            case CHAT_COMMAND_CREATE_USER -> createUserInChat();
            case CHAT_COMMAND_LOG_IN -> logInUser();
            case CHAT_COMMAND_WRITE -> writeLetterInChat();
            case CHAT_COMMAND_READ -> readMessagesInChat(currentUser);
            case CHAT_COMMAND_LOG_OUT -> logOutUser();
            case CHAT_COMMAND_EXIT -> {
                print(CHAT_EXIT_MESSAGE);
                System.exit(0);
            }
        }
    }

    /**
     * Проверка команды, выбранной из списка
     */
    private boolean hasCommandChoice(String command) {
        int result = 0;
        result += command.equals(CHAT_COMMAND_CREATE_USER) ? 1 : 0;
        result += command.equals(CHAT_COMMAND_LOG_IN) ? 1 : 0;
        result += command.equals(CHAT_COMMAND_WRITE) ? 1 : 0;
        result += command.equals(CHAT_COMMAND_READ) ? 1 : 0;
        result += command.equals(CHAT_COMMAND_LOG_OUT) ? 1 : 0;
        result += command.equals(CHAT_COMMAND_EXIT) ? 1 : 0;
        return result > 0;
    }

    /**
     * Создание пользователя и запуск чата
     */
    private void createUserInChat() {
        createUser(usersList);
        startingTheChat();
    }

    /**
     * Авторизация пользователя
     */
    private void logInUser() {
        String name = askUserName();
        String password = askUserPassword();
        usersList.stream()
                .filter(person -> person.getName().equals(name)
                        && person.getPassword().equals(password))
                .findAny()
                .ifPresentOrElse(
                        person -> {
                            print(name, USER_LOGGED_IN);
                            currentUser = person;
                            print(DELIMITER);
                            startingTheChat();
                        },
                        () -> {
                            throw new RuntimeException(USER_DO_NOT_EXIST_ERROR);
                        });
    }

    /**
     * Выход пользователя из системы
     */
    private void logOutUser() {
        printFormatted(USER_LOG_OUT, currentUser.getName());
        print(DELIMITER);
        currentUser = null;
        startingTheChat();
    }

    /**
     * Запись полученных имени адресата и письма в исходящие и исходящие сообщения
     */
    private void writeLetterInChat() {
        writeLetter(currentUser, usersList);
        startingTheChat();
    }

    /**
     * Чтение и вывод в консоль всех сообщений пользователя
     */
    private void readMessagesInChat(User currentUser) {
        readMessages(currentUser);
        startingTheChat();
    }
}
