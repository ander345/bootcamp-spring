package com.open.ejerciciosspring.service;
//import java.*

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public String hello(){
        System.out.println("saludando");
        return "hola mundo";
    }
}
