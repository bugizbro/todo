package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		System.out.println("***************************");
		System.out.println("hello world");
		System.out.println("***************************");
		SpringApplication.run(TodoApplication.class, args);
	}

}
