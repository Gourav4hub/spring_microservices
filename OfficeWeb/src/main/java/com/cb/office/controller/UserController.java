package com.cb.office.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cb.office.entity.User;
import com.cb.office.model.UserModel;
import com.cb.office.response.ApiResponse;
import com.cb.office.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ResponseEntity<ApiResponse> saveUser(@RequestBody UserModel userModel)
	{
		User user = new User(userModel);
		ApiResponse response = userService.save(user);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<ApiResponse> listUsers(){
		return new ResponseEntity<ApiResponse>(userService.list(),HttpStatus.OK);
	}
}
