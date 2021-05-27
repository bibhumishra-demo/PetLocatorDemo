package pet.locator.demo.service.api.gateway.agreegator;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pet.locator.demo.service.api.gateway.agreegator.client.PetLocationDataClient;
import pet.locator.demo.service.api.gateway.agreegator.client.PetOwnerDataClient;
import pet.locator.demo.service.api.gateway.beans.PetAndLocationData;
import pet.locator.demo.service.api.gateway.beans.PetData;
import pet.locator.demo.service.api.gateway.beans.PetOwner;

@RestController
public class Agreegator {
	

	@Resource
	private PetOwnerDataClient petOwnerDataClient;

	@Resource
	private PetLocationDataClient petLocationDataClient;
	
	
	
	@GetMapping("/petowners")
	public String getPetOwners() throws JsonMappingException, JsonProcessingException {
		
		var jsonString = petOwnerDataClient.getPetOwners();
		
		List<PetOwner> petOwners =  (new ObjectMapper()).readValue(jsonString, new TypeReference<List<PetOwner>>() {});
		
		petOwners.forEach((owner) -> System.out.println(owner.toString())); 
		
		return "success";
	}
	
	
	
	@GetMapping("/petlocations")
	public String getPetLocations() throws JsonMappingException, JsonProcessingException {
		
		var jsonPetData = petLocationDataClient.getPetData();
		var jsonPetLocations = petLocationDataClient.getPetLocations();
		
		List<PetData> petDataList =  (new ObjectMapper()).readValue(jsonPetData, new TypeReference<List<PetData>>() {});
		List<PetAndLocationData> petLocationDataList =  (new ObjectMapper()).readValue(jsonPetLocations, new TypeReference<List<PetAndLocationData>>() {});
		
		petDataList.forEach((owner) -> System.out.println(owner.toString())); 
		petLocationDataList.forEach((owner) -> System.out.println(owner.toString())); 
		
		return "success";
	}
	
	@GetMapping("/petlocations/{id}")
	public String getPetLocationsByPetid(@PathVariable("id") Long id) throws JsonMappingException, JsonProcessingException {
		
		var jsonPetLocationData = petLocationDataClient.getPetDataByPetId(id);
		
		List<PetAndLocationData> petDataList =  (new ObjectMapper()).readValue(jsonPetLocationData, new TypeReference<List<PetAndLocationData>>() {});
		
		petDataList.forEach((owner) -> System.out.println(owner.toString())); 
		
		return "success";
	}
	
	@PostMapping("/savePet")
	public String savePetLocations(@RequestBody PetAndLocationData petData) throws JsonProcessingException, IOException, InterruptedException {
		
		//var jsonString = petLocationDataCleint.savePetLocations(petData);
		
		return null;
		
	}
	
	
}
