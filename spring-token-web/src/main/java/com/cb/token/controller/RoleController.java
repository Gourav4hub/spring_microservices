package com.cb.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.token.entity.Role;
import com.cb.token.model.RoleModel;
import com.cb.token.repository.RoleRepository;
import com.cb.token.response.ApiResponse;

@RestController
@RequestMapping("/role")
public class RoleController 
{
	@Autowired
	private RoleRepository roleRepo;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveRole(@RequestBody RoleModel model)
	{
		Role role = new Role(model);
		role = roleRepo.save(role);
		ApiResponse response = new ApiResponse(true, "Role Saved !", role);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<ApiResponse> listRoles(){
		return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Roles List !",roleRepo.findAll()),HttpStatus.OK);
	}
}
