# 01-springBoot简介

## Spring Boot是什么？

1. SpringBoot是一个框架，一种全新的编程规范，他的产生简化了框架的使用，所谓简化是指简化了Spring众多框架中所需的大量且繁琐的配置文件，所以 SpringBoot是一个服务于框架的框架，服务范围是简化配置文件。

2. 它使用“习惯优于配置”（项目中存在大量的配置，此外还内置了一个习惯性的配置，让你无需手动进行配置）的理念让你的项目快速运行起来。使用Spring Boot很容易创建一个独立运行（运行jar,内嵌Servlet容器）、准生产级别的基于Spring框架的项目，使用Spring Boot你可以不用或者只需要很少的Spring配置。

3. 因为我之前是做前端的，我习惯和前端的基础栈去比较，我感觉springBoot更像是前端的脚手架vue-cli, springBoot有一个配置文件 `application.yaml` ，可以对项目全局配置，比如端口号，基础请求路径，运行环境,其他扩展等进行配置，vue-cli也有一个 `vue.config.js`，可以对项目进行配置，springBoot有一个文件 `pom.xml`
可以对依赖以及依赖的版本号进行控制，vue-cli也有一个文件 `package.json`可以对项目的依赖进行控制。


## Spring Boot的核心功能

1. 独立运行的spring项目：可以以jar包的形式独立运行，通过Java -jar xx.jar来运行。
2. 内嵌的servlet容器：可以选择内嵌的Tomcat、Jetty或者Undertow。
3. 提供starter简化，maven配置:通过一系列的starter pom 来简化maven的依赖加载。
4. 自动配置spring：spring boot 会根据在类路径中的jar包、类，为jar包里的类自动配置bean，这样会极大的减少我们要使用的配置。
5. 准生产的应用监控：提供了基于http、ssh、telnet对运行的项目进行监控。
6. 无代码生成的xml配置：通过条件注解来实现。

## Spring Boot的优点

1. 快速构建项目
2. 对主流的开发框架的无配置集成
3. 项目可独立运行，无须外部用来servlet容器
4. 提供运行时的应用监控
5. 极大的提高了开发部署效率
6. 与云计算天然集成

## Spring Boot快速搭建
直接使用idea,点击右上角【file】-->【new】-->【project】， 选择左边【Spring Initializr】，填上关键信息后即可创建springBoot项目


## 基础项目结构
创建好项目后，可以看到有如下文件：

1. src/main/java  程序开发以及主程序入口
2. src/main/resources 配置文件
3. src/test/java  测试程序
4. pom.xml springBoot配置文件


[返回首页](../README.md)