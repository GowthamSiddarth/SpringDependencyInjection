package com.yodlee.springdependencyinjection.consumer;

import com.yodlee.springdependencyinjection.service.MessageService;

public class ConsumerWithXML {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recepient) {
        messageService.sendMessage(message, recepient);
    }
}
