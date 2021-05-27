package com.coding.excercise.pet.locator.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coding.excercise.pet.locator.Entity.PetData;
import com.coding.excercise.pet.locator.Repo.PetDataRepo;

@Service
public class PetDataService {
	
	@Autowired 
	private PetDataRepo petDatarepo;
	

	public PetData savePetData(PetData petData) {
		return petDatarepo.save(petData);
	}
	
	public List<PetData> savePetData(List<PetData> petData) {
		return petDatarepo.saveAll(petData);
	}
	
	public Optional<PetData> findPet(Long petid) {
		return petDatarepo.findById(petid);
	}

	public Optional<List<PetData>> findAll() {
		return Optional.ofNullable(petDatarepo.findAll());
	}

	public Optional<List<PetData>> findPetByOwnerid(Long petOwnerId) {
		return petDatarepo.findAllByPetOwnerId(petOwnerId);
	}

	
}
