package com.james.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.james.dojosurvey.models.Survey;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("locations", new String[] {"boise", "vegas", "cali", "florida"});
		viewModel.addAttribute("languages", new String[] {"java", "python", "mern", "ruby"});
		return "index.jsp";
	}
	@RequestMapping(value="/survey", method = RequestMethod.POST)
	public String survey(@RequestParam("name")String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		//easier and cleaner way of getting all attributes
		viewModel.addAttribute("result",new Survey(name, location, language, comment));
		// single way of getting all the attributes added
		//viewModel.addAttribute("name", name);
		//viewModel.addAttribute("location", location);
		//viewModel.addAttribute("language", language);
		//viewModel.addAttribute("comment", comment);
	
		return "result.jsp";
	}
}
