package com.sharp6.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Sharp6Application {

	public static void main(String[] args) {
		SpringApplication.run(Sharp6Application.class, args);
		System.out.println("hello application starts");
	}

}
