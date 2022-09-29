package com.cb.token.entity;

import javax.persistence.*;

import com.cb.token.model.RoleModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
public class Role 
{
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long roleId;

    @Column(name = "role_name",unique = true,nullable = false)
    private String name;

    @Column(name = "description",nullable = true)
    private String description;
    
    public Role(RoleModel model) {
    	this.name = model.getName();
    	this.description = model.getDescription();
    }
}
