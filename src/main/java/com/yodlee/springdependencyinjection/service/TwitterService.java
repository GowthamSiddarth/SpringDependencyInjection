package com.yodlee.springdependencyinjection.service;

public class TwitterService implements MessageService {
    public boolean sendMessage(String message, String recepient) {
        System.out.println("tweet sent (" + message + ") to " + recepient);
        return true;
    }
}
