package com.cb.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cb.office.model.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User 
{
	public User(UserModel userModel) {
		this.setUserName(userModel.getName());
		this.setEmail(userModel.getEmail());
		this.setPassword(userModel.getPassword());
		this.setRoles(userModel.getRoles());
	}

	@Id
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_name")
	private String userName;	
	
	@Column(name = "email" , unique = true)
	private String email;
	
	@JsonIgnore
	@Column(name = "password")
	private String password;	
	
	@Column(name = "roles")
	private String roles;	
}
