package com.cb.token.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.cb.token.model.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User 
{
    @Id
    @Column(name = "user_id")   
    private String userId;

    @Column(name = "user_name",unique = true,nullable = false)
    private String username;

    @Column(name = "user_password",nullable = false)
    @JsonIgnore
    private String password;

    @Column(name = "user_email",unique = true,nullable = false)
    private String email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id") })
    private Set<Role> roles;
    
    public User(UserModel model,Role role) {
    	this.username = model.getUsername();
    	this.email = model.getEmail();
    	this.password = model.getPassword();
    	this.userId = UUID.randomUUID().toString();
    	this.roles = new HashSet<>();
    	this.roles.add(role);
    }
}
