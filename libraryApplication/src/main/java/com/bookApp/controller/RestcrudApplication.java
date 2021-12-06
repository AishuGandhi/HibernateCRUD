package com.bookApp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.bookApp.controller","com.bookApp.entity", "com.bookApp.dao"})
public class RestcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcrudApplication.class, args);
	}

}
