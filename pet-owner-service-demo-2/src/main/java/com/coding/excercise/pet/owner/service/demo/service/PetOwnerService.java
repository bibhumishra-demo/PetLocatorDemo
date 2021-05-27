package com.coding.excercise.pet.owner.service.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.excercise.pet.owner.service.demo.entity.PetOwner;
import com.coding.excercise.pet.owner.service.demo.repo.PetOwnerRepo;

@Service
public  class PetOwnerService {

	
	@Autowired
	PetOwnerRepo repo;
	
	public List<PetOwner> save(List<PetOwner> petOwners) {
		return repo.saveAll(petOwners);
	}

	public PetOwner save(PetOwner petOwner) {
		return repo.save(petOwner);
	}

	public Optional<PetOwner> findbyId(Long petownerId) {
		return repo.findById(petownerId);
	}

	public List<PetOwner> findAll() {
		return repo.findAll();
	}

}
