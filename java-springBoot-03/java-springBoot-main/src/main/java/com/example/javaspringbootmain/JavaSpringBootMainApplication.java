package com.example.javaspringbootmain;

import com.example.config.EnablePerson;
import com.example.config.PersonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan("com.example.config")
//@Import(PersonConfig.class)
@EnablePerson
public class JavaSpringBootMainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaSpringBootMainApplication.class, args);
        Object person = context.getBean("person");
        System.out.println(person);
    }
}
