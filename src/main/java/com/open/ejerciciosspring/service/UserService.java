package com.open.ejerciciosspring.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notification = new NotificationService();

    String response = notification.hello();

}
