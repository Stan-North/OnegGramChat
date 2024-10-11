package user;

import message.Message;
import message.MessageType;

import java.util.*;

public class User {
    private final String name;
    private final String password;
    private HashMap<MessageType, ArrayList<Message>> messages;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Map<MessageType, ArrayList<Message>> getMessages() {
        return messages;
    }
}
