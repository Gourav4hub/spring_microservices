package com.cb.second.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cb.second.model.RequestData;

@RestController
@RequestMapping("/web")
public class WebController 
{
	// Get / Post : formData Individual
	@PostMapping("/req1")
	public String request1(@RequestParam(name = "title") String title,
							@RequestParam(name = "number",required = false) Integer num,
							@RequestParam(name = "data",defaultValue = "25") Float data) 
	{
		return title + " : " +  num + " : " + data;
	}
	
	@PostMapping("/req2")
	public RequestData request2(RequestData reqdata) 
	{
		return reqdata;
	}
	
	@PostMapping("/req3")
	public RequestData request3(@RequestBody RequestData reqdata) 
	{
		return reqdata;
	}
	
	@PostMapping("/req4/{title}/{number}")
	public String request4(@PathVariable String title,
							@PathVariable(required = false) Integer number) 
	{
		return title + number;
	}
}
