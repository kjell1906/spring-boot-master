package com.example.demoj16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJ16Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJ16Application.class, args);
	}

	@GetMapping
	Customer customer() {
		return new Customer(1L, "James Bond");
	}

	class Customer{
		private final Long id;
		private final String name;

		public Customer(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}
}
