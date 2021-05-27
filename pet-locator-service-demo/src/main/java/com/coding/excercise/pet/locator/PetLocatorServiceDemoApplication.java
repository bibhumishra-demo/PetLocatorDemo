package com.coding.excercise.pet.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PetLocatorServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetLocatorServiceDemoApplication.class, args);
	}

}
