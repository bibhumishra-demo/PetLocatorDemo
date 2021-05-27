package com.coding.excercise.pet.locator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.excercise.pet.locator.Entity.PetLocation;
import com.coding.excercise.pet.locator.Repo.PetLocationRepo;

@Service
public class PetLocationService {
	
	@Autowired
	private PetLocationRepo repo;

	public PetLocation savePetLocation(PetLocation petLocation) {
		
		return repo.save(petLocation);
	}

	public List<PetLocation> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<PetLocation> findAllByPetId(Long id) {
		return repo.findAllByPetId(id);
	}
	

}
