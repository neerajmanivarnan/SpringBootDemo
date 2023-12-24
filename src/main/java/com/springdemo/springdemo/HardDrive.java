package com.springdemo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HardDrive {

    @Autowired
    SemiConductor semi;

    public void mem() {
        System.out.println("Hard drive class created and mem method created");
        semi.diode();
    }

}
