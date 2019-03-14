package com.yodlee.springdependencyinjection.consumer;

import com.yodlee.springdependencyinjection.service.MessageService;

public class ConsumerWithXML {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean processMessage(String message, String recepient) {
        return messageService.sendMessage(message, recepient);
    }
}
