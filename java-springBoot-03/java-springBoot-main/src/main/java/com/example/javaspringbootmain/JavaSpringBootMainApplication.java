package com.example.javaspringbootmain;

import com.example.config.EnablePerson;
import com.example.config.MyImportBeanDefinitionRegistrar;
import com.example.config.MyImportSelector;
import com.example.config.PersonConfig;
import com.example.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Map;


//@ComponentScan("com.example.config")
//@Import(PersonConfig.class)
//@EnablePerson


// @Import(Person.class)

//@Import(PersonConfig.class)
@SpringBootApplication
// @Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public class JavaSpringBootMainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaSpringBootMainApplication.class, args);
        Object person = context.getBean(Person.class);
        System.out.println(person);

//        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
//        System.out.println(beansOfType);

    }
}
