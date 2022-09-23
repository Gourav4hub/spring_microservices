package com.cb.office.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class UserModel 
{
	private String name;
	private String email;
	private String password;
	private String roles;
}
