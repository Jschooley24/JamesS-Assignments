package com.james.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class GoldController {
	

	@GetMapping("/")
	//viewModel  back end to the front end front end the key to display the value 
	//only good for this method and the return
	//session can be any model through the whole project
	public String gold(Model viewModel, HttpSession session) {
		if(session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
		}
		ArrayList<String> activs = new ArrayList<String>();
		if(session.getAttribute("activities") == null) {
			session.setAttribute("activities", activs);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("totalGold"));
		viewModel.addAttribute("totalGold", session.getAttribute("avtivities"));
		
		return "gold.jsp";
	
	}

	//this runs when we click "find gold" button on html because on html page we have the action = /findGold
	@PostMapping("/findGold")
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();//random number
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		ArrayList<String> activities = (ArrayList<String>)session.getAttribute("activities");
		int goldThisTurn;
		
		
		if (building.equals("farm")) {
			goldThisTurn = r.nextInt((20 - 10) +1 ) + 10;
			activities.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		}else if(building.equals("house")) {
			goldThisTurn = r.nextInt((10 - 5) +1 ) + 5;
			activities.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		}else if (building.equals("cave")) {
			goldThisTurn = r.nextInt((5 - 2) +1 ) + 2;
			activities.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
		}else if (building.equals("casino")) {
			goldThisTurn = r.nextInt((50 + 50) + 1) - 50; 
			if(goldThisTurn < 0) {
				activities.add(String.format("You entered a %s and lost %d gold %s. OUCH!!", building, goldThisTurn, formatter.format(now)));
			} else {
				activities.add(String.format("You entered a %s and earned %d gold %s", building, goldThisTurn, formatter.format(now)));
			}
			
		}else {
			System.out.println("building not recognized");
			return "redirect:/";
		}
		int gold = (int)session.getAttribute("totalGold");
		int totalGold = gold += goldThisTurn;
		session.setAttribute("totalGold", totalGold);
		session.setAttribute("activities", activities);
		return "redirect:/";
	}
}
