package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringexampleApplication {
	
	
	@GetMapping("/")
	public String welcome() {
		return "welcome to Java"
	}
	

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "hi "+ input + "your application deployed successfully";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringexampleApplication.class, args);
	}

}
