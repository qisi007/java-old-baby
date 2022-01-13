package com.example.javaspringboot02.config;
import com.example.javaspringboot02.condition.ClassCondition;
import com.example.javaspringboot02.condition.ConditionOnClass;
import com.example.javaspringboot02.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    // @Conditional(ClassCondition.class)
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user () {
        return  new User();
    }
}
