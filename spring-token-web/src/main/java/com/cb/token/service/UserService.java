package com.cb.token.service;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cb.token.entity.User;
import com.cb.token.repository.UserRepository;


@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserRepository userRepo;
	
	public boolean saveUser(User user) {
		try{
			userRepo.save(user);
			return true;
		}catch(Exception ex) {
			System.err.println("User Save Error : "+ex.getMessage());
			return false;
		}
	}
	
	public boolean isExistByName(String name) {
		return userRepo.findByUsername(name).isPresent();
	}
	
	private Set<SimpleGrantedAuthority> getAuthority(User user) 
	{
        Set<SimpleGrantedAuthority> authorities = new HashSet();
        user.getRoles().forEach(role -> {        	
            authorities.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        });
        return authorities;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		Optional<User> opUser = userRepo.findByUsername(username);
		if(opUser.isPresent())
		{
			User user = opUser.get();
	        if(user == null){
	            throw new UsernameNotFoundException("Invalid username or password.");
	        }else {
	        	return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
	        }	
		}else {
			throw new UsernameNotFoundException("Invalid username or password.");
		}		
    }

}
