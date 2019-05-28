package iot.air.quality.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {

	@Id
	private String id;
	private long locationLongtitude;
	private long locationLatitude;

	public Device(String id, long locationLongtitude, long locationLatitude) {
		this.id = id;
		this.locationLongtitude = locationLongtitude;
		this.locationLatitude = locationLatitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getLocationLongtitude() {
		return locationLongtitude;
	}

	public void setLocationLongtitude(long locationLongtitude) {
		this.locationLongtitude = locationLongtitude;
	}

	public long getLocationLatitude() {
		return locationLatitude;
	}

	public void setLocationLatitude(long locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

}
