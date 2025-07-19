/**
 * Entry point for the Spring Boot Pet Adoption Platform application.
 * Launches the Spring application context and initializes all components.
 */
package com.petadopt.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.petadopt"})
/**
 * Main Spring Boot application class.
 */
public class PetAdoptionPlatformApplication {

	/**
     * Main method that starts the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
		SpringApplication.run(PetAdoptionPlatformApplication.class, args);
	}

}
