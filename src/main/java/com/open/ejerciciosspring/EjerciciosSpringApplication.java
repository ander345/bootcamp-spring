package com.open.ejerciciosspring;

import com.open.ejerciciosspring.service.NotificationService;
import com.open.ejerciciosspring.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EjerciciosSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService notification = (UserService) context.getBean("userService");

        SpringApplication.run(EjerciciosSpringApplication.class, args);
    }

}
