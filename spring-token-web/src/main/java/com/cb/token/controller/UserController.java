package com.cb.token.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.token.entity.Role;
import com.cb.token.entity.User;
import com.cb.token.model.RoleModel;
import com.cb.token.model.UserModel;
import com.cb.token.repository.RoleRepository;
import com.cb.token.repository.UserRepository;
import com.cb.token.response.ApiResponse;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveUser(@RequestBody UserModel model)
	{
		Optional<Role> opRole =  roleRepo.findById(model.getRoleId());
		if(opRole.isPresent())
		{
			Role role = opRole.get();
			User user = new User(model, role);
			userRepo.save(user);
			ApiResponse response = new ApiResponse(true, "User Saved !", user);
			return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
		}else {
			ApiResponse response = new ApiResponse(false, "Role Not Found !", null);
			return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
		}		
	}
}
