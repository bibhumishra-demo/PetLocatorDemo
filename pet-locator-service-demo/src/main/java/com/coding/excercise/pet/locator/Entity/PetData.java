package com.coding.excercise.pet.locator.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;


@Entity
public class PetData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long petId;
	@NotNull
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
