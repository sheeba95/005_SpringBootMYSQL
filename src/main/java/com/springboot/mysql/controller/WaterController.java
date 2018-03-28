package com.springboot.mysql.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.entity.UseWater;
import com.springboot.mysql.repository.WaterRepository;

@RestController
@RequestMapping("/water")
public class WaterController {
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Free waters are provided";
	}
	
	@RequestMapping("/welcome/free")
	public String welcomefree() {
		return "You win 1 ltr of free cocktail";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addWater(@RequestBody UseWater useWater) {
		waterRepository.save(useWater);
		return "Saved the water in water tank: " + useWater.getQuantity() + " " + useWater.getContainer();
	}

	@RequestMapping(value="/update/{id}", method = RequestMethod.POST)
	public String updateWater(@RequestBody UseWater useWater,@PathVariable Integer id) {
		
		waterRepository.findAll();
		useWater.setId(id);
		waterRepository.save(useWater);
		return "Updated water tank is: "+ useWater.getQuantity() + " " + useWater.getContainer();
	}

	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable Integer id) {
		
		waterRepository.delete(id);
		return "Emptied water in water tank";
		
	}
	@RequestMapping("getallwater")
	public List<UseWater> getAllWater() {
		List<UseWater> allWater = new ArrayList<>();
		waterRepository.findAll().forEach(allWater::add);
		return allWater;	
	}
	
}
