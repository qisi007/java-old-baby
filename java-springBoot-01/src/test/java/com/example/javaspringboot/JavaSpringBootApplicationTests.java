package com.example.javaspringboot;


import com.example.javaspringboot.domain.User;
import com.example.javaspringboot.mapper.UserMapper;
import com.example.javaspringboot.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaSpringBootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void testUser () {
        List<User> list = userMapper.findAll();

        System.out.print(list);
    }

    @Test
    public void testUser2 () {
        List<User> list = userXmlMapper.findAll();
        System.out.print(list);
        System.out.print("测试通过");
    }
}






//
//import com.example.javaspringboot.controller.HelloJava;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = JavaSpringBootApplication.class)
//class JavaSpringBootApplicationTests {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Test
//    public void testSet() {
//
//        redisTemplate.boundValueOps("name").set("李四");
//    }
//
//    @Test
//    public void testGet () {
//        Object name =  redisTemplate.boundValueOps("name").get();
//        System.out.print(name);
//    }
//}
