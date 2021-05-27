package pet.locator.demo.service.api.gateway.beans;

import java.util.List;
import java.util.Optional;

public class PetAndLocationData {
	
	private List<PetData> petData;
	private List<PetLocation> petLocation;
	
	public PetAndLocationData() { }
	
	public PetAndLocationData(List<PetData> petData, List<PetLocation> petLocation) {
		super();
		this.petData = petData;
		this.petLocation = petLocation;
	}
	public List<PetData> getPetData() {
		return petData;
	}
	public void setPetData(List<PetData> petData) {
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
