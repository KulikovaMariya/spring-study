package ru.geekbrains.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Registry registry = context.getBean("registry", Registry.class);
        registry.getReferral();

//        ApplicationContext context = new AnnotationConfigApplicationContext("Config.class");
//        Registry registry = context.getBean("registry", Registry.class);
//        registry.getReferral();

    }


}