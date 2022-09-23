package com.cb.office.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cb.office.entity.SystemUserDetails;
import com.cb.office.entity.User;
import com.cb.office.repository.UserRepository;

@Service
public class SystemUserDetailsService implements UserDetailsService 
{
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
	{		
		User user = userRepo.findByEmail(email);
		
		return new SystemUserDetails(user);
	}
}
