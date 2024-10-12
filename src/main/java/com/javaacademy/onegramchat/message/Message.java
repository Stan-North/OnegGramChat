package com.javaacademy.onegramchat.message;

import com.javaacademy.onegramchat.user.User;

public class Message {
    private String text;
    private MessageType messageType;
    private User sender;
    private final User recipient;

    public Message(String text, User sender, User recipient) {
        this.text = text;
        this.sender = sender;
        this.recipient = recipient;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getText() {
        return text;
    }
}
