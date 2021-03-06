package com.example.javaspringboot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.example.javaspringbootother.config")
//@Import(PersonConfig.class)
public class JavaSpringBoot02Application {
    public static void main(String[] args) {
        // 启动sprintboot应用，返回run方法
        ConfigurableApplicationContext context = SpringApplication.run(JavaSpringBoot02Application.class, args);
        // 获取Bean,redisTemplate
//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.print(redisTemplate);

//        Object user = context.getBean("user");
//        System.out.println(user);

        Object person = context.getBean("person");
        System.out.println(person);
    }
}
