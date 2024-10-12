import user.User;

public class Runner {
    public static void main(String[] args) {
        OneGramChat oneGramChat = new OneGramChat();
        System.out.println("РЕГИСТРАЦИЯ первого пользователя");
        oneGramChat.createUser();
        System.out.println("----------");
        System.out.println("РЕГИСТРАЦИЯ второго пользователя");
        oneGramChat.createUser();
        System.out.println("----------");
        System.out.println("АВТОРИЗАЦИЯ первого пользователя");
        oneGramChat.logInUser();
        oneGramChat.writeLetter();
        oneGramChat.logOutUser();

        System.out.println("АВТОРИЗАЦИЯ второго пользователя");
        oneGramChat.logInUser();
        oneGramChat.writeLetter();
        oneGramChat.logOutUser();

        //oneGramChat.logOutUser();
        //oneGramChat.createUser();

//        for (User user : oneGramChat.usersList) {
//            System.out.println(user);
//        }

    }
}
