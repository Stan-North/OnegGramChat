package user;

import message.Message;
import message.MessageType;

import java.util.*;

public class User {
    private final String name;
    private final String password;
    private HashMap<MessageType, LinkedList<Message>> messages;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        messages = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Map<MessageType, LinkedList<Message>> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", messages=" + messages +
                '}';
    }
}
