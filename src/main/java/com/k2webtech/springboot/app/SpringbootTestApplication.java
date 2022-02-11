package com.k2webtech.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2webtech.springboot.app.service.NumberConversion;

@SpringBootApplication
@RestController
@RequestMapping(path = "/springboot-project/api/v1")
public class SpringbootTestApplication {
	
	private final NumberConversion numberConversion;
	
	public SpringbootTestApplication(NumberConversion numberConversion) {
		this.numberConversion = numberConversion;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
	}
	
	@GetMapping("/convert")
	public void convertNumber() {
		// Test convert number 100 to binary
		numberConversion.convertNumberDecimalToBinary(100);
	}
	
}
