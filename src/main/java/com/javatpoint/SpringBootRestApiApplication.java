package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiApplication {

	public static void main(String[] args) {
		System.out.println("This is spring boot application");
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

}
