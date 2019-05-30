package com.iot.spring.iotwebapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "location_longtitude", nullable = false)
	private long locationLongtitude;
	@Column(name = "location_latitude", nullable = false)
	private long locationLatitude;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Data> datas = new ArrayList<>();

	public Device() {
	}

	public Device(long id, long locationLongtitude, long locationLatitude, List<Data> datas) {
		this.id = id;
		this.locationLongtitude = locationLongtitude;
		this.locationLatitude = locationLatitude;
		this.datas = datas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public List<Data> getDataSamples() {
		return datas;
	}

	public void setDataSamples(List<Data> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", locationLongtitude=" + locationLongtitude + ", locationLatitude="
				+ locationLatitude + ", datas=" + datas + "]";
	}

	
}
