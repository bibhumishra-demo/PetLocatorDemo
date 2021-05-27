package com.coding.excercise.pet.locator.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

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


	public PetLocationResponse findPetLocationsByIdLessthan24Hours(Long id) {
		
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(new Date());
	    calendar.add(Calendar.HOUR, 24);
	    Timestamp timestamp = new Timestamp(calendar.getTimeInMillis());
	    //LocalDateTime.from(new Date().toInstant()).plusDays(1))
		PetLocationResponse petLocations = new PetLocationResponse();
		petLocations.setPetData(petDataRepo.findById(id));
		petLocations.setPetLocation(petLocationRepo.findByLocationTimestampBefore(timestamp.toLocalDateTime().toLocalDate()));
		
		
		return petLocations;
	}
}
