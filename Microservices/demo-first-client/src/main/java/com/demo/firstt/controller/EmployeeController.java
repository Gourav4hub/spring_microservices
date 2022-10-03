package com.demo.firstt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.firstt.response.ApiResponse;

@RestController
@RequestMapping("/emp")
public class EmployeeController 
{
	@GetMapping("/first")
	public ApiResponse first() {
		return new ApiResponse(true, "Get Emp....", "Success");
	}
}
