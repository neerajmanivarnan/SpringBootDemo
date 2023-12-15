package com.springdemo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile() {
        System.out.println("Compilation Successful...");
        System.out.println("Compile method in laptop class called successfully...");
    }

}
