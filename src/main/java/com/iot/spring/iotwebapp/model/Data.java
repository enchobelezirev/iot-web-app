package com.iot.spring.iotwebapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "data")
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn( insertable = false, updatable = false)
	private Device device;
	@Column(name = "sample_data", nullable = false)
	private long data;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified", nullable = true)
	private Date modified;

	public Data() {
	}

	public Data(long id, Device device, long data, Date modified) {
		this.id = id;
		this.device = device;
		this.data = data;
		this.modified = modified;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public Date getCreatedOn() {
		return modified;
	}

	public void setCreatedOn(Date createdOn) {
		this.modified = createdOn;
	}

}
