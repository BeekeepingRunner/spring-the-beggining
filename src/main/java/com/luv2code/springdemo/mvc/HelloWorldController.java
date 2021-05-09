package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String result = "Yo! ";
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		result += theName;
		
		model.addAttribute("message", result); 
		
		return "helloworld";
	}
	
	@RequestMapping("/processFromVersionThree")
	public String processFromVersionThree(
			@RequestParam("studentName") String studentName,
			Model model) {
		
		String result = "Hey from v3! ";
		studentName = studentName.toUpperCase();
		result += studentName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
