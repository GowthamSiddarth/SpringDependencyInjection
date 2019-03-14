package com.yodlee.springdependencyinjection.consumer;

import com.yodlee.springdependencyinjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerWithAnnotation {
    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean processMessage(String message, String recepient) {
        return messageService.sendMessage(message, recepient);
    }
}
