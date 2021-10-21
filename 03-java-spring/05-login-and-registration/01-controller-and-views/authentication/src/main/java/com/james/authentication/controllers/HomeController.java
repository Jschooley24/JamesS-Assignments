package com.james.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.james.authentication.models.User;
import com.james.authentication.services.UserService;
import com.james.authentication.validators.UserValidator;

@Controller
public class HomeController {
	
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;






@GetMapping("/")//registration
public String landing(@ModelAttribute("user")User user) {
	return "landing.jsp";
}
@PostMapping("/registerUser")//register the user
public String register(@Valid @ModelAttribute("user")User user, BindingResult result, HttpSession session) {
	validator.validate(user, result);
	if(result.hasErrors()) {
		return "landing.jsp";
	}
	User newUser = this.uService.registerUser(user);
	session.setAttribute("user__id",newUser.getId());
	return "redirect:/dashboard";
}
@PostMapping("/login")//exam
public String login(HttpSession session, @RequestParam("lemail") String email, @RequestParam("lpassword")String password, RedirectAttributes redirectAttr) {//userToLogin from select form on HTML
	if(!this.uService.authenticateUser(email, password)) {
		redirectAttr.addFlashAttribute("loginError", "Invalid Email");
		return "redirect:/";
	}
	User userToBeLoggedIn = this.uService.getUserByEmail(email);
	session.setAttribute("user__id", userToBeLoggedIn.getId());//who ever is login in will be stored in user__id
	return "redirect:/dashboard";
}
@GetMapping ("/logout")//kills the session and erases the user id who is logged in
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/";
}
@GetMapping("/dashboard")//exam
public String index(Model viewModel, HttpSession session) {
	if(session.getAttribute("user__id") == null) {//safe guard are url so noone can login with out a user__id
		return "redirect:/";
	}
	viewModel.addAttribute("user", this.uService.getOneUser((Long)session.getAttribute("user__id")));//identify who is loged in
	viewModel.addAttribute("allAlbums", this.aService.getAllAlbums());
	return "index.jsp";
	
}
}