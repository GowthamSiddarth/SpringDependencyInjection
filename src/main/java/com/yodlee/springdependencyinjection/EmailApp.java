package com.yodlee.springdependencyinjection;

import com.yodlee.springdependencyinjection.configuration.EmailConfiguration;
import com.yodlee.springdependencyinjection.consumer.ConsumerWithAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmailConfiguration.class);
        ConsumerWithAnnotation application = context.getBean(ConsumerWithAnnotation.class);

        String message = "Spring Framwork";
        String recepient = "gothsiddu@gmail.com";
        application.processMessage(message, recepient);

        context.close();
    }
}
