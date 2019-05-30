package com.iot.spring.iotwebapp.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iot.spring.iotwebapp.model.Data;
import com.iot.spring.iotwebapp.model.Device;
import com.iot.spring.iotwebapp.repository.DataRepository;
import com.iot.spring.iotwebapp.repository.DeviceRepository;

@RestController
@RequestMapping("/samples")
public class DataRestController {

	private DataRepository repository;
	private DeviceRepository deviceRepository;
	
	public DataRestController(DataRepository repository, DeviceRepository deviceRepository) {
		this.repository = repository;
		this.deviceRepository = deviceRepository;
	}

	@PostMapping
	public Data create(@Valid @RequestBody Data data){
		Optional<Device> d =deviceRepository.findById(Integer.toUnsignedLong(2));
		if (d.isPresent()) {
			Date time = Calendar.getInstance().getTime();
			System.out.println(d);
			data = new Data(0, d.get(), data.getData(), new Timestamp(time.getTime()));
		}
		return repository.save(data);
	}
	
	@GetMapping
	public List<Data> getAll(){
		return repository.findAll();
	}
}
