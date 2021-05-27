package pet.locator.demo.service.api.gateway.beans;


import java.util.Date;



public class PetLocation {
	private Long petLocationId ;
	private Long petId;
	private String longitude;
	private String latitude;
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
	
	
}