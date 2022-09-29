package com.cb.token.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class UserModel {
	 private String username;
     private String password;
     private String email;
     private Integer roleId;
}
