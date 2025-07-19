/**
 * Controller class for handling web requests related to pets.
 * Exposes endpoints for pet management in the web interface.
 */
package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

@Controller
//Main class for handling pet-related operations
@RequestMapping("/pets")
/**
 * Web controller for managing pet records.
 */
/** Method */
    public class PetController {
	
    @Autowired
    /** Field */
    private PetService petService;

	String hostName = "localhost";
    String route;
    int port = 8080;
    
	/** Field */
    private String credentials = "test123:test123";
	/** Field */
    private String base64Creds = Base64.getEncoder().encodeToString(credentials.getBytes());

    @GetMapping("/display")
    /** Method */
    public String displayLoggedIn(Model model) {
        
        route = "/api/pets";
        
        String url = "http://" + hostName + ":" + port + route;
        RestTemplate restTemplate = new RestTemplate();
        
        HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Basic " + base64Creds);
		HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<List<Pet>> response = restTemplate.exchange(
            													url, 
            													HttpMethod.GET, 
            													entity, 
            													new ParameterizedTypeReference<List<Pet>>() {});
        List<Pet> pets = response.getBody();
        
        model.addAttribute("title", "List of Pets");
        model.addAttribute("pets", pets);
        
        return "pets";
    }
    
   	@GetMapping("/display/{id}")
   	/** Method */
    public String displaySelected(@PathVariable Integer id, Model model) {
           
           route = "/api/pets/" + id;
           
	        String url = "http://" + hostName + ":" + port + route;
	        RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("Authorization", "Basic " + base64Creds);
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            
	        ResponseEntity<Pet> response = restTemplate.exchange(
	            													url, 
	            													HttpMethod.GET, 
	            													entity, 
	            													new ParameterizedTypeReference<Pet>() {});
	            											
           Pet pet = response.getBody();
           
           model.addAttribute("title", "List of Pets");
        	model.addAttribute("pets", List.of(pet));
           
           return "pets";
  	}
	
    // Method to display all pets
	@GetMapping("/new")
	/** Method */
    public String displayNewPetForm(Model model) {
        model.addAttribute("pet", new Pet(0, null, 0, null, null, null, null, null));
        return "pet/create";
    }
    
    @PostMapping("/doNew")
    /** Method */
    public String addPet(@Valid Pet pet, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.toString());
            return "pet/create";
        }
        
        petService.addPet(pet);
        return "redirect:/pets/new";
    }
    
    @GetMapping("/update/{id}")
    /** Method */
    public String displayUpdatePetForm(@PathVariable Integer id, Model model) {
        model.addAttribute("pet", petService.getPetById(id));
        return "pet/update";
    }
    
    @PostMapping("update/doUpdate")
    /** Method */
    public String updatePet(@Valid Pet pet, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "pet/update";
        }
        
        petService.updatePet(pet);
        return "redirect:/pets/display";
    }
    
    @PostMapping("delete/{id}")
    /** Method */
    public String deletePet(@PathVariable Integer id, Model model) {
        petService.deletePet(petService.getPetById(id));
        return "redirect:/pets/display";
    }
    
}