package com.coding.excercise.pet.owner.service.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PetOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	Long petOwnerId;	
	String name;
	String cellNumber;
	String address;
	Boolean hasOptedForContactSharing;

	public Boolean getHasOptedForContactSharing() {
		return hasOptedForContactSharing;
	}

	public void setHasOptedForContactSharing(Boolean hasOptedForContactSharing) {
		this.hasOptedForContactSharing = hasOptedForContactSharing;
	}

	public Long getPetOwnerId() {
		return petOwnerId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCellNumber() {
		return cellNumber;
	}

	public void setPetOwnerId(Long id) {
		this.petOwnerId = id;
	}
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PetOwner [petOwnerId=" + petOwnerId + ", name=" + name + ", cellNumber=" + cellNumber + ", address="
				+ address + "]";
	}

	public PetOwner(Long petOwnerId, String name, String cellNumber, String address,Boolean hasOptedForContactSharing) {
		super();
		this.petOwnerId = petOwnerId;
		this.name = name;
		this.cellNumber = cellNumber;
		this.address = address;
		this.hasOptedForContactSharing = hasOptedForContactSharing;
	}
	public PetOwner() { }

	
}
