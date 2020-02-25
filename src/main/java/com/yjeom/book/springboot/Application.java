package com.yjeom.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@ComponentScan({"com.yjeom.book.springbook"})
@SpringBootApplication
public class Application {
    public static void main(String[]args){
        SpringApplication.run(Application.class,args);
    }

}
