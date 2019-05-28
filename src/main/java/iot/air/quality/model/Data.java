package iot.air.quality.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Device device;
	private long data;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;

	public Data(long id, Device device, long data, Date modified) {
		super();
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
