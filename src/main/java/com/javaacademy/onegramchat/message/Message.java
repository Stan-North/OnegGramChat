package com.javaacademy.onegramchat.message;

import com.javaacademy.onegramchat.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class Message {
    @NonNull private String text;
    @NonNull private User sender;
    @NonNull private final User recipient;
}
