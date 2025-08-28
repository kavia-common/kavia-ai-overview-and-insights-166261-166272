package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PUBLIC_INTERFACE
 * Spring Boot application entry point.
 */
@SpringBootApplication(scanBasePackages = "com.example.backend")
public class backendApplication {

	public static void main(String[] args) {
		SpringApplication.run(backendApplication.class, args);
	}
}
