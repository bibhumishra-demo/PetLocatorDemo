package com.coding.excercise.pet.locator.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.excercise.pet.locator.Entity.PetLocation;

@Repository
public interface PetLocationRepo extends JpaRepository<PetLocation, Long>{

	List<PetLocation> findAllByPetId(Long id);

}
