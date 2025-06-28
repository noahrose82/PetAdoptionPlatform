package com.petadopt.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.petadopt"})
public class PetAdoptionPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetAdoptionPlatformApplication.class, args);
	}

}
