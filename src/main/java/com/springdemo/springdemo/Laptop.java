package com.springdemo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    HardDrive hard;


    public void compile() {
        System.out.println("Laptop class created and compile method caller");
        hard.mem();

    }

}
