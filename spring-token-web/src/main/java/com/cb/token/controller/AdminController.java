package com.cb.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cb.token.config.TokenProvider;
import com.cb.token.model.LoginUserModel;
import com.cb.token.response.ApiResponse;


@RestController
@RequestMapping("/admin")
public class AdminController 
{
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private TokenProvider jwtTokenUtil;
		
	@PostMapping("/authenticate")
	public ApiResponse authenticate(@RequestBody LoginUserModel loginUser)
	{
		System.out.println(loginUser);
		try {
		final Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						loginUser.getUsername(),
						loginUser.getPassword()
				)
		);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		final String token = jwtTokenUtil.generateToken(authentication);		
		return new ApiResponse(true,"Login Success",token);
		}catch(BadCredentialsException ex) {
			return new ApiResponse(false, "Login Failed",null);
		}
	}
}

