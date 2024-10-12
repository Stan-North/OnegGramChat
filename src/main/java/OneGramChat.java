import user.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class OneGramChat {
    private static final String ENTER_USER_NAME = "Введите имя пользователя";
    private static final String ENTER_USER_PASSWORD = "Введите пароль";
    private static final String USER_LOGGED_IN = "Пользователь авторизован";
    private static final String USER_DO_NOT_EXIST_ERROR = "Такого пользователя нет";

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

    public void logOutUser() {
        currentUser = null;
    }

    private String askUserName() {
        System.out.println(ENTER_USER_NAME);
        return scanner.next();
    }

    private String askUserPassword() {
        System.out.println(ENTER_USER_PASSWORD);
        return scanner.next();
    }
}
