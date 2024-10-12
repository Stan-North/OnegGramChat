import user.User;

public class Runner {
    public static void main(String[] args) {
    OneGramChat oneGramChat = new OneGramChat();
        System.out.println("РЕГИСТРАЦИЯ");
    oneGramChat.createUser();
        System.out.println("----------");
        System.out.println("АВТОРИЗАЦИЯ");
    oneGramChat.logInUser();
    //oneGramChat.logOutUser();
    //oneGramChat.createUser();

    for (User user : oneGramChat.usersList) {
            System.out.println(user);
        }
    }
}
