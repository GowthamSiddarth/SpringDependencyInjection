package com.yodlee.springdependencyinjection.service;

public class TwitterService implements MessageService {
    public void sendMessage(String message, String recepient) {
        System.out.println("tweet sent (" + message + ") to " + recepient);
    }
}
