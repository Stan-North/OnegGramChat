package com.javaacademy.onegramchat.user;

import com.javaacademy.onegramchat.message.Message;
import com.javaacademy.onegramchat.message.MessageType;
import lombok.*;

import java.util.*;

@RequiredArgsConstructor
@Getter
public class User {
    @NonNull
    private final String name;
    @NonNull
    private final String password;
    @Setter
    private HashMap<MessageType, ArrayList<Message>> messages;
}
