package com.james.dojoandninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.james.dojoandninja.models.Ninja;
import com.james.dojoandninja.repositories.NinjaRepository;

public class NinjaService {
	@Autowired 
	private NinjaRepository nRepo;
	
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	public List<Ninja> allNinjas(){
		return this.nRepo.findAll();
	}

}
