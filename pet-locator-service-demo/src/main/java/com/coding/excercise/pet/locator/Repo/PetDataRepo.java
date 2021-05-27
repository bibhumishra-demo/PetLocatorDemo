package com.coding.excercise.pet.locator.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.excercise.pet.locator.Entity.PetData;


@Repository
public interface PetDataRepo extends JpaRepository<PetData, Long> {
	
	public Optional<List<PetData>> findAllByPetOwnerId(Long  petOwnerId);

}
