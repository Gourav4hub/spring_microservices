package com.cb.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cb.office.entity.User;
import com.cb.office.service.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OfficeWebApplication implements CommandLineRunner 
{
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(OfficeWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		if(!userService.findByEmail("vikas@wse.com"))
		{
		User user = new User(null, "Vikas", "vikas@wse.com","12345","ROLE_SUPER_ADMIN");
		userService.save(user);
		}
	}
}
