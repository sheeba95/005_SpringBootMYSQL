package com.springboot.mysql.mainappentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.mysql.controller"})
public class SpringMainApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringMainApp.class, args);
	}

}
