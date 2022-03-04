# 08-EnableAutoConfiguration注解


 - @EnableAutoConfiguration注解注解内部使用@Important(AutoConfigurationInportSelector.class)来加载配置类
 - 配置文件位置： META-INF/spring.factories,该配置文件中定义了大量的配置类，当SpringBoot应用启动时，会自动加载这些配置类，注释Bean
 - 并不是所有的Bean都会被初始化，在配置类中使用Condition来满足加载条件的Bean









[返回首页](../README.md)