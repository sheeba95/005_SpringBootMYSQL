package com.springboot.mysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.mysql.entity.UseWater;

public interface WaterRepository extends CrudRepository<UseWater, Integer>{
	
	
}
