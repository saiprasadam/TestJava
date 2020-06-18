package com.docker.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleAppDockrController {
	

	@Autowired
	UserInformation userInformation;
 
	@RequestMapping(value = "/")
	public String welcome(Model model) {
		model.addAttribute("UserInformation", userInformation); 
		return "index";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String welcomeUser(@RequestParam("name") String name, Model model) {
		model.addAttribute("name","Welcome "+ name);
		  model.addAttribute("message", " This is the Docker Container Demo");
		return "result";
	}
}
