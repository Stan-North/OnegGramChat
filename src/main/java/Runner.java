import user.User;

public class Runner {
    public static void main(String[] args) {
    OneGramChat oneGramChat = new OneGramChat();
    oneGramChat.createUser();
    oneGramChat.logInUser();
    oneGramChat.logOutUser();
    oneGramChat.createUser();
        for (User user : oneGramChat.usersList) {
            System.out.println(user);
        }
    }
}
