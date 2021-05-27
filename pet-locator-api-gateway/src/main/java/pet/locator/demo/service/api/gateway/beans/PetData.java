
package pet.locator.demo.service.api.gateway.beans;


public class PetData {
	
	private Long petId;
	private Long petOwnerId;
	private String petName;
	private String petCategory;

	public PetData() { }
	
	public PetData(Long petId, Long petOwnerId, String petName, String petCategory) {
		super();
		this.petId = petId;
		this.petOwnerId = petOwnerId;
		this.petName = petName;
		this.petCategory = petCategory;
	}
	@Override
	public String toString() {
		return "PetData [petId=" + petId + ", petOwnerId=" + petOwnerId + ", petName=" + petName + ", petCategory="
				+ petCategory + "]";
	}
	public Long getPetId() {
		return petId;
	}
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	public Long getPetOwnerId() {
		return petOwnerId;
	}
	public void setPetOwnerId(Long petOwnerId) {
		this.petOwnerId = petOwnerId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetCategory() {
		return petCategory;
	}
	public void setPetCategory(String petCategory) {
		this.petCategory = petCategory;
	}
	
 
}
