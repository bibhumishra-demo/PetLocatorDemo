package com.coding.excercise.pet.locator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.excercise.pet.locator.Entity.PetLocation;

import com.coding.excercise.pet.locator.service.PetLocationService;

@RestController
@RequestMapping("/pet/locations/")

public class PetLocationController {
	
	@Autowired
	private PetLocationService locationSvc;
	
	@PostMapping("/")
	public PetLocation savePetLocation(@RequestBody PetLocation petLocation) {
		
		return locationSvc.savePetLocation(petLocation);
	}
	
	@GetMapping("/all")
	public List<PetLocation> findAll() {
		return locationSvc.findAll();
	}
	
	@GetMapping("/pets/{id}")
	public List<PetLocation> findAllbyPetId(@PathVariable("id") Long id) {
		return locationSvc.findAllByPetId(id);
	}

}
