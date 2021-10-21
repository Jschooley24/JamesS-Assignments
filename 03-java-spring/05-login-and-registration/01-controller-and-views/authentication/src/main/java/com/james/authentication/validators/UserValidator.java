package com.james.authentication.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.james.authentication.models.User;
import com.james.authentication.repositories.UserRepository;



@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	//object super class and access to binding result. 
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);//User is telling to user USER path
	}
	//custom validators
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password","Match", "Password does not match");//password from forms path.Match what we wanna call it. "password do not match" custom validator.
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email has already been used.");
		}
		if(user.getFirstName().equals("cheese")) {
			errors.rejectValue("firstName","noCheeseHeads","No CheeseHeads allowed");
		}
	}
	

}