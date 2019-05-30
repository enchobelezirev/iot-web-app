package com.iot.spring.iotwebapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iot.spring.iotwebapp.model.Device;
import com.iot.spring.iotwebapp.repository.DeviceRepository;

@RestController
@RequestMapping("/devices")
public class DeviceRestController {

	private DeviceRepository repository;
	
	public DeviceRestController(DeviceRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public Device createDevice(@Valid @RequestBody Device device){
		return repository.save(device);
	}
	
	@GetMapping
	public List<Device> getAll(){
		return repository.findAll();
	}
}
