package com.cb.token;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cb.token.entity.Role;
import com.cb.token.entity.User;
import com.cb.token.repository.RoleRepository;
import com.cb.token.service.UserService;

@SpringBootApplication
@EnableEurekaClient
public class SpringTokenWebApplication implements CommandLineRunner  
{
	@Autowired
	private UserService userService;
	@Autowired
	private RoleRepository roleRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTokenWebApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		if(!userService.isExistByName("admin"))
		{
			Role rol1 = new Role();
			rol1.setName("ROLE_SUPER_ADMIN");
						
			Set<Role> roles = new HashSet<>();
			roles.add(rol1);
			
			BCryptPasswordEncoder encodeObj = new BCryptPasswordEncoder();
			
			User user = new User();
			user.setUserId(UUID.randomUUID().toString());
			user.setEmail("admin@gmail.com");
			user.setPassword(encodeObj.encode("12345"));
			user.setUsername("admin");
			user.setRoles(roles);
			
			roleRepo.save(rol1);
			userService.saveUser(user);
		}
		
	}

}
