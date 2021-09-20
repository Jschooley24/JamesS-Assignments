package com.james.displaydate.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private Date getDate() {
		Date now = new Date();
		return now;

	}

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model viewmodel) {
		viewmodel.addAttribute("datetime", getDate());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model viewmodel) {
		viewmodel.addAttribute("datetime", getDate());
		return "time.jsp";
	}


}