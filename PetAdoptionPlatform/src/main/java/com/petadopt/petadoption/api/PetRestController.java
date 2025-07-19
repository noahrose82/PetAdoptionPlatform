/**
 * REST controller for handling pet-related API requests.
 * Provides endpoints for pet retrieval, creation, and deletion.
 */
package com.petadopt.petadoption.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.service.PetService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/api")
@Tag(name = "Pets", description = "API for managing pets in the adoption system")
/**
 * Exposes RESTful endpoints for pet management.
 */
/** Method */
    public class PetRestController {
	
	@Autowired
	/** Field */
    private PetService service;
	
	@Operation(summary = "Get all pets", description = "Returns a list of all pets")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful retrieval"),
        @ApiResponse(responseCode = "404", description = "No pets found"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
	@GetMapping("/pets")
	/** Method */
    public ResponseEntity<?> getPets() {
		
		try {
			List<Pet> pets = service.getPets();
			if (pets.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			} else {
				return new ResponseEntity<>(pets, HttpStatus.OK);
			}
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Operation(summary = "Get pet by ID", description = "Returns a single pet by its ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pet found"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
	@GetMapping("/pets/{id}")
	/** Method */
    public ResponseEntity<?> getOnePet(@PathVariable int id) {
		
		try {
			Pet pet = service.getPetById(id);
			if (pet == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			} else {
				return new ResponseEntity<>(pet, HttpStatus.OK);
			}
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
