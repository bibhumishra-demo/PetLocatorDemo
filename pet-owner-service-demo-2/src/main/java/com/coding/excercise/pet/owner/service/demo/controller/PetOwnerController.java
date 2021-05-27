package com.coding.excercise.pet.owner.service.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.excercise.pet.owner.service.demo.entity.PetOwner;
import com.coding.excercise.pet.owner.service.demo.repo.PetOwnerRepo;
import com.coding.excercise.pet.owner.service.demo.service.PetOwnerService;
@RestController
@RequestMapping("/petowners")
@Component
public class PetOwnerController {
	
	@Autowired
	private PetOwnerService svc;
	
	@PostMapping("/")
	public List<PetOwner> savepetOwner(@RequestBody List<PetOwner> petOwner) {
		return svc.save(petOwner);
	}
	public PetOwner savepetOwner(@RequestBody PetOwner petOwner) {
		return svc.save(petOwner);
	}
	
	@GetMapping("/{id}")
	public Optional<PetOwner> findByOwnerId(@PathVariable("id") long id) {
		return svc.findbyId(id);
		
	}
	
	@GetMapping("/all")
	public List<PetOwner> findByOwnerId() {
		return svc.findAll();
		
	}
	
}

	

