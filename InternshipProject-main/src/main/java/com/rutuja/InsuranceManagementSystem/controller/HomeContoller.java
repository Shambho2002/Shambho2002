package com.rutuja.InsuranceManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rutuja.InsuranceManagementSystem.domain.Message;

@Controller
public class HomeContoller {
	
	
	
	
	
	@GetMapping({"/","/home"})
	public String homePage(Model model)
	{
		return "home";
	}
	
	
	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		return "AboutUs";
	}
	
	
	
	@GetMapping("/contactUs")
	public String contactPage(Model model) {
		model.addAttribute("message", new Message());
		
		return "ContactUs";
	}

	
	
	
	
	
	
	
	
	
	

}
