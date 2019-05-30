package com.iot.spring.iotwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iot.spring.iotwebapp.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long>{

}
