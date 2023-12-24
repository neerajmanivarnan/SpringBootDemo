package com.springdemo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop lp;
    public  void demo(){
        System.out.println("Alien class created and demo method called");
        lp.compile();
    }
}
