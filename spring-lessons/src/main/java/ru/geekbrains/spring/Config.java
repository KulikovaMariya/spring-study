package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean (name = "registry")
    public Registry registry() {
        return new Registry();
    }
}
