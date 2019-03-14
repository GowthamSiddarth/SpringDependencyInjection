package com.yodlee.springdependencyinjection;

import com.yodlee.springdependencyinjection.consumer.ConsumerWithXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwitterApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsumerWithXML application = context.getBean(ConsumerWithXML.class);

        String message = "Spring Framework";
        String recepient = "gothsiddu@twitter.com";

        application.processMessage(message, recepient);
        context.close();
    }
}
