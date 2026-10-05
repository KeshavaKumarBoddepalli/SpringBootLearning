package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.demp_controller;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	static demp_controller controller;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		controller.payment();

	}

}
