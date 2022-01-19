package com.example.config;

import com.example.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
    @Bean
    public Person person () {
        return new Person();
    }
}
