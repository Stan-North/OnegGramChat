package com.javaacademy.onegramchat.message;

public enum MessageType {
    INCOMING("Входящие"),
    OUTGOING("Исходящие");
    private final String type;

    MessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
