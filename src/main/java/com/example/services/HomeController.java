package com.example.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")	
	public String Home()
	{
		System.out.println("Hello World");
		
		return "Hello user";
	}

}
