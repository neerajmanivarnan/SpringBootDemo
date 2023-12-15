package com.springdemo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.demo();

	}

}
