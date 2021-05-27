package com.coding.excercise.pet.locator.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.excercise.pet.locator.Entity.PetData;
import com.coding.excercise.pet.locator.service.PetDataService;

@RestController
@RequestMapping("/pets")
@Component
public class PetDataController {
		
	@Autowired 
	private PetDataService svc;
	
	@PostMapping("/")
	public List<PetData> savePetData(@RequestBody List<PetData> petData) {
		return svc.savePetData(petData);
	}
	public PetData savePetData(@RequestBody PetData petData) {
		return svc.savePetData(petData);
	}
	
	@GetMapping("/all/owners/{id}")
	public Optional<List<PetData>> findAllPetbyOwnerId(@PathVariable Long petOwnerId) {
		return svc.findPetByOwnerid(petOwnerId);
	}

	@GetMapping("/{id}")
	public Optional<PetData> findPetbyId(@PathVariable Long petId) {
		return svc.findPet(petId);
	}
	
	
	@GetMapping("/all")
	public Optional<List<PetData>> findPetbyId() {
		return svc.findAll();
	}
	
	

}
