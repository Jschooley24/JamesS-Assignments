package com.james.dojoandninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.james.dojoandninja.models.Dojo;
import com.james.dojoandninja.repositories.DojoRepository;

public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public List<Dojo> allDojos(){
		return this.dRepo.findAll();
	}

}
