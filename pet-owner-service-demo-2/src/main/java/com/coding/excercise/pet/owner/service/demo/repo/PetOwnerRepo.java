package com.coding.excercise.pet.owner.service.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.excercise.pet.owner.service.demo.entity.PetOwner;

public interface PetOwnerRepo extends JpaRepository<PetOwner, Long> {

}
