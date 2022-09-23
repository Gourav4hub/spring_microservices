package com.cb.office.entity;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SystemUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private User user;

	public SystemUserDetails(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRoles());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {		
		return user.getUserName();
	}
	
	public String getUserId() {
		return user.getUserId();
	}
	
	public String getUserType() {
		return user.getRoles();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		if(user!=null)
			return true;
		else
			return false;
	}
}
