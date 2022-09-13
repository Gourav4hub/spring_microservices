package com.cb.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/web")
public class WebController 
{
	@GetMapping("/home")
	public @ResponseBody String home() 
	{
		return "Welcome To Pataa Navigation";
	}
	
	@GetMapping("/help")
	public @ResponseBody String help() 
	{
		return "Help Page";
	}
	
	
	
}
