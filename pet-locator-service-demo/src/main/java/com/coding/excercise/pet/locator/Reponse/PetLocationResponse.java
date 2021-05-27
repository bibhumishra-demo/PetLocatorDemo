package com.coding.excercise.pet.locator.Reponse;
import java.util.List;
import java.util.Optional;
import com.coding.excercise.pet.locator.Entity.PetData;
import com.coding.excercise.pet.locator.Entity.PetLocation;

public class PetLocationResponse {
	
	private Optional<PetData> petData;
	private List<PetLocation> petLocation;
	
	public PetLocationResponse() { }
	
	public PetLocationResponse(Optional<PetData> petData, List<PetLocation> petLocation) {
		super();
		this.petData = petData;
		this.petLocation = petLocation;
	}
	public Optional<PetData> getPetData() {
		return petData;
	}
	public void setPetData(Optional<PetData> petData) {
		this.petData = petData;
	}
	public List<PetLocation> getPetLocation() {
		return petLocation;
	}

	public void setPetLocation(List<PetLocation> petLocation) {
		this.petLocation = petLocation;
	}

	@Override
	public String toString() {
		return "PetLocationResponse [petData=" + petData + ", petLocation=" + petLocation + "]";
	}

}
