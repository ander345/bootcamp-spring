package com.open.ejerciciosspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UserService {

    NotificationService notification;
    String saludo;
    //String response;

    public UserService(NotificationService notificationService, String saludo){
        //this.response = notification.hello();
        System.out.println("Ejecutando constructor userService");
        this.notification = notificationService;
        this.saludo = saludo;
    }

}
