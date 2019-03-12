package com.yodlee.springdependencyinjection.service;

public class EmailService implements MessageService {
    public void sendMessage(String message, String recepient) {
        System.out.println("email sent (" + message + ") to " + recepient);
    }
}
