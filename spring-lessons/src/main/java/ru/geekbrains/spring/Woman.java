package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("woman")
public class Woman {

    @Value("57")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
}
