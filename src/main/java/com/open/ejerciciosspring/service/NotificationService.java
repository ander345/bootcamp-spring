package com.open.ejerciciosspring.service;
//import java.*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Ejecutando constructor NotificationService");
    }

    public String hello(){

        System.out.println("saludando");
        return "hola mundo";
    }
}
