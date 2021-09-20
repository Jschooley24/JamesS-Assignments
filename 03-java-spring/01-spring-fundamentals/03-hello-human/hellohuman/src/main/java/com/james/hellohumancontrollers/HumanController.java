package com.james.hellohumancontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", defaultValue="Human") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "index.jsp";
	}

}
