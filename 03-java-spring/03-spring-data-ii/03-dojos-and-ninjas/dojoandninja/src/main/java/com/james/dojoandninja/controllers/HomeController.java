package com.james.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.james.dojoandninja.models.Dojo;
import com.james.dojoandninja.models.Ninja;
import com.james.dojoandninja.services.DojoService;
import com.james.dojoandninja.services.NinjaService;

public class HomeController {
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	@GetMapping("/newninja")
	public String newninja(@ModelAttribute("ninja")Ninja ninja) {
		return "newninja.jsp";
	}
	
	@GetMapping("/newdojo")
	public String newdojo(@ModelAttribute("dojo")Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/newninja")
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors())
			return "newninjajsp";
		this.nService.createNinja(ninja);
		return "redirect:/newninja.jsp";
	}
	
	@PostMapping("/newdojo")
	public String Create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors())
			return "/newdojo.jsp";
		this.dService.createDojo(dojo);
		return "redirect:/newdojo";
	}
}




