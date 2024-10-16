package com.javaacademy.onegramchat.user;

import com.javaacademy.onegramchat.message.Message;
import com.javaacademy.onegramchat.message.MessageType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.*;

@RequiredArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class User {
    @NonNull
    String name;
    @NonNull
    String password;
    private HashMap<MessageType, ArrayList<Message>> messages;
}
