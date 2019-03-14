package com.yodlee.springdependencyinjection.configuration;

import com.yodlee.springdependencyinjection.service.EmailService;
import com.yodlee.springdependencyinjection.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.yodlee.springdependencyinjection.consumer"})
public class EmailConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }
}
