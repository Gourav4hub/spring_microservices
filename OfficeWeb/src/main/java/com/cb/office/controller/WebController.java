package com.cb.office.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.office.response.ApiResponse;

@RestController
public class WebController 
{
	@GetMapping("/accessDenied")
	public ResponseEntity<ApiResponse> accessDenied()
	{
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Unauthorized Access !",null),HttpStatus.UNAUTHORIZED);
	}
	
	
	@RequestMapping(value = "/login")	
	public String login(Model model, String error, String logout) 
	{
		if (error != null)
		{
			model.addAttribute("errorMsg", "Your username and password are invalid.");			
		}
		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}
}
