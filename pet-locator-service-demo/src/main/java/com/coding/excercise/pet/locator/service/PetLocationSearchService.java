package com.coding.excercise.pet.locator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.excercise.pet.locator.Repo.PetDataRepo;
import com.coding.excercise.pet.locator.Repo.PetLocationRepo;
import com.coding.excercise.pet.locator.Reponse.PetLocationResponse;

@Service
public class PetLocationSearchService {


	@Autowired 
	private PetDataRepo petDataRepo;
	
	@Autowired 
	private PetLocationRepo petLocationRepo;

	
	public PetLocationResponse findPetLocationsbyPetId(Long petId) {
		PetLocationResponse petLocations = new PetLocationResponse();
		petLocations.setPetData(petDataRepo.findById(petId));
		petLocations.setPetLocation(petLocationRepo.findAllByPetId(petId));
		
		
		return petLocations;
	}
}
