package com.example.gustavo_springboot_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GustavoSpringbootChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GustavoSpringbootChallengeApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "ola mundo";
	}
}
