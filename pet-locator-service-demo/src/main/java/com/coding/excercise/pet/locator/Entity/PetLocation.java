package com.coding.excercise.pet.locator.Entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
public class PetLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long petLocationId ;
	
	@NotNull
	private Long petId;
	@NotNull
	private String longitude;
	@NotNull
	private String latitude;
	@Basic(optional = false)
	//@Column(name = "locationTimestamp", insertable = true, updatable = false)
	@Column( insertable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date locationTimestamp;
	
	public PetLocation() { }
	
	public PetLocation(Long petLocationId, Long petId, String longitude, String latitude, Date lastTouched) {
		super();
		this.petLocationId = petLocationId;
		this.petId = petId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.locationTimestamp = lastTouched;
	}

	@Override
	public String toString() {
		return "PetLocation [petId=" + petId + ", petLocationId=" + petLocationId + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", lastTouched=" + locationTimestamp + "]";
	}
	
	public Long getPetLocationId() {
		return petLocationId;
	}
	public void setPetLocationId(Long petLocationId) {
		this.petLocationId = petLocationId;
	}
	public Long getPetId() {
		return petId;
	}
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Date getLocationTimestamp() {
		return locationTimestamp;
	}
	public void setLocationTimestampd(Date lastTouched) {
		this.locationTimestamp = lastTouched;
	}
	
	
	
	
	
	/**@Generated(GenerationType.
    private LocalDateTime dateCreated = LocalDateTime.now();;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edit_timestamp", 
	        updatable = false
	        columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date editTimestamp;**/
}
