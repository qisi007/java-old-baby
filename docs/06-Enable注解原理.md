
# 06-Enable注解原理

springBoot中提供了很多Enable开头的注解，这些注解都是用于动态启用某些功能的。而底层原理是使用@Import注解导入一些配置类，实现Bean的动态加载

然后我们思考一个问题，springBoot工程是否可以直接获取jar包中定义的Bean呢？

我们可以自己来验证一把。

首先，这需要两个项目工程，一个用来定义Bean，另一个用来获取Bean。

我们在工程中先获取一个Bean(这个我们规定为项目1)，暂且定义为person,一会儿我们会在另外一个工程中定义这个Bean

```
Object person = context.getBean("person");
System.out.println(person);
```

然后我们新建一个工程，写一下person这个Bean（这个我们叫项目2）

先在domain的文件夹新建一个Person这个类，里边什么也不写
```
package com.example.javaspringbootother.domain;

public class Person {
}
```
然后再写个配置类，在config文件夹下新建PersonConfig这个配置类
```
@Configuration
public class PersonConfig {
    @Bean
    public Person person () {
        return new Person();
    } 
}
```

然后我们运行一下项目1，看看能否获取person这个Bean

可以看到控制台上报错了，提示不能获取这个Bean

为什么呢？ 我们可以看一下启动类上有一个注解 `SpringBootApplication`, 点进这个注解可以看一下这里边有一个注解叫
`ComponentScan`， 这个注解有一个作用，它其实是起扫描作用的，他的扫描范围是当前引导类所在包及其子包，项目1的包名是`com.example.javaspringboot02`,
项目2这个Bean的包名是 `com.example.javaspringbootother.config`, 既不是这个类下的包，也不是他的子包，因此我们就不能获取这个Bean了

其实想要获取这个Bean还是有很多方法的：
> 使用@ComponentScan扫描`com.example.javaspringbootother.config`

在项目1的引导类上添加一个注解









[返回首页](../README.md)