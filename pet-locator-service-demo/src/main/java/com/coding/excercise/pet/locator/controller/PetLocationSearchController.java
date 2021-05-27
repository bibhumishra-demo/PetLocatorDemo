package com.coding.excercise.pet.locator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coding.excercise.pet.locator.Reponse.PetLocationResponse;
import com.coding.excercise.pet.locator.service.PetLocationSearchService;

@RestController
@RequestMapping("/pets/locations")
@Component
public class PetLocationSearchController {

	@Autowired 
	private PetLocationSearchService svc;
	
	@GetMapping("/{id}")
	public PetLocationResponse findPetLocationsbyPetId(@PathVariable("id")  long petId) {
		return svc.findPetLocationsbyPetId(petId);
	}
	
}
