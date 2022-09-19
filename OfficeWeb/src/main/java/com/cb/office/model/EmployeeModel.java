package com.cb.office.model;

import com.cb.office.entity.Address;

import lombok.Data;

@Data
public class EmployeeModel {
	private Integer id;
	private String name;
	private Float salary;
	private String phone;
	private String mail;
	private AddressModel addressModel;
}
