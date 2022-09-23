package com.cb.office.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.office.entity.User;
import com.cb.office.repository.UserRepository;
import com.cb.office.response.ApiResponse;

@Service
public class UserService implements BaseService<User> 
{
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public ApiResponse save(User ob) 
	{
		ob.setUserId(UUID.randomUUID().toString());
		userRepo.save(ob);
		return new ApiResponse(true,"User Saved !",ob);
	}

	@Override
	public ApiResponse update(User ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse list() {
		return new ApiResponse(true,"User List !",userRepo.findAll());
	}

	@Override
	public ApiResponse get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean findByEmail(String email) {
		return userRepo.findByEmail(email)!=null;
	}
	
}
