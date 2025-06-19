package com.petadopt.petadoption; // Package declaration

import org.springframework.boot.SpringApplication; // Import required class
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import required class
import org.springframework.context.annotation.ComponentScan; // Import required class

@SpringBootApplication // Annotation
@ComponentScan({"com.petadopt"}) // Annotation
public class PetAdoptionPlatformApplication { // Class declaration

	public static void main(String[] args) { // Main method: entry point
		SpringApplication.run(PetAdoptionPlatformApplication.class, args); // Launch Spring Boot app
	}

}
