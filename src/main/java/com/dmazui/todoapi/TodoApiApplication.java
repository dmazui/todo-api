package com.dmazui.todoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EntityScan(basePackages = {"com.dmazui.todoapi.model"})
public class TodoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApiApplication.class, args);
	}
	
	@GetMapping
	public String hello() {
		return "{\"bem vindo\": \"to do list\", \"api de atividades\" : \"by dmazui\"}";
	}

}
