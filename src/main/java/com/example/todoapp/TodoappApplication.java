package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		System.out.println("Starting the application");
		SpringApplication.run(TodoappApplication.class, args);
	}

}
