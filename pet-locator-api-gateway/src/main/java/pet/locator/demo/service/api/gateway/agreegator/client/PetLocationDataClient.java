package pet.locator.demo.service.api.gateway.agreegator.client;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

import pet.locator.demo.service.api.gateway.beans.PetAndLocationData;

public interface PetLocationDataClient {

	public String savePetLocations(PetAndLocationData petData) throws JsonProcessingException, IOException, InterruptedException;

	public String getPetLocations();

	public String getPetData();

	public String getPetDataByPetId(Long id);
	

}
