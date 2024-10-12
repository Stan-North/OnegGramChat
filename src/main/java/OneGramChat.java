import message.Message;
import message.MessageType;
import user.User;

import java.util.*;

public class OneGramChat {
    private static final String ENTER_USER_NAME = "Введите имя пользователя";
    private static final String ENTER_USER_PASSWORD = "Введите пароль";
    private static final String USER_LOGGED_IN = "Пользователь авторизован";
    private static final String USER_DO_NOT_EXIST_ERROR = "Такого пользователя нет";
    private static final String USER_DO_NOT_AUTHORISED = "Вы не авторизованы";
    private static final String INCOMING_PATTERN = "Письмо от %s: %s";
    private static final String OUTGOING_PATTERN = "Письмо к %s: %s";

    private static final Scanner scanner = new Scanner(System.in);

    public ArrayList<User> usersList;
    private User currentUser;

    public OneGramChat() {
        usersList = new ArrayList<>();
    }

    /**
     * Создание пользователя
     */
    public void createUser() {
        String name = askUserName();
        String password = askUserPassword();
        User user = new User(name, password);
        usersList.add(user);
    }

    /**
     * Авторизция пользователя
     */
    public void logInUser() {
        String name = askUserName();
        String password = askUserPassword();
        usersList.stream()
                .filter(person -> person.getName().equals(name) && person.getPassword().equals(password))
                .findAny()
                .ifPresentOrElse(
                        person -> {
                            System.out.println(USER_LOGGED_IN);
                            currentUser = person;
                            },
                        () -> {
                            throw new RuntimeException(USER_DO_NOT_EXIST_ERROR);
                        });
    }

    /**
     * Выход пользователя из системы
     */
    public void logOutUser() {
        currentUser = null;
    }

    /**
     * Считывание ответа на запрос системой имени пользователя
     */
    private String askUserName() {
        System.out.println(ENTER_USER_NAME);
        return scanner.next();
    }

    /**
     * Считывание ответа на запрос системой пароля пользователя
     */
    private String askUserPassword() {
        System.out.println(ENTER_USER_PASSWORD);
        return scanner.next();
    }

    /**
     * Чтение и вывод в консоль всех сообщений пользователя
     */
    private void readLetters() {
        if (currentUser == null) {
            throw new RuntimeException(USER_DO_NOT_AUTHORISED);
        }
        printIncomingMessage();
        printOutgoingMessage();
    }

    /**
     * Печать к консоль всех входящих сообщений пользователя
     */
    private void printIncomingMessage() {
        currentUser
                .getMessages()
                .get(MessageType.INCOMING)
                .stream()
                .forEach(message -> System.out.println(
                        INCOMING_PATTERN.formatted(message.getSender(), message.getText())));
    }

    /**
     * Печать к консоль всех исходящих сообщений пользователя
     */
    private void printOutgoingMessage() {
        currentUser
                .getMessages()
                .get(MessageType.OUTGOING)
                .stream()
                .forEach(message -> System.out.println(
                        OUTGOING_PATTERN.formatted(message.getSender(), message.getText())));
    }
}
