package com.cb.office.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.cb.office.service.SystemUserDetailsService;


@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter 
{

	@Autowired
	SystemUserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		
		 	http.csrf().disable();
		
	        http.authorizeRequests()        
	        .antMatchers("/").permitAll()
	        .antMatchers("/user/**").hasRole("SUPER_ADMIN")	        
	        .antMatchers("/employee/**").hasAnyRole("SUPER_ADMIN","ADMIN")
	        .antMatchers("/task/**").hasAnyRole("SUPER_ADMIN","ADMIN")
	        .antMatchers("/address/**").hasAnyRole("SUPER_ADMIN","ADMIN")
	        .and()        
	        .formLogin().loginPage("/login").permitAll()
	        .defaultSuccessUrl("/success").usernameParameter("email")
	        .and()
	        .exceptionHandling().accessDeniedPage("/accessDenied").and()
	        .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/")
	        .and().httpBasic();	
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	}
}
