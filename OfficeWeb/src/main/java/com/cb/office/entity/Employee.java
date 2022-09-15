package com.cb.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_info")
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "emp_name",length = 100)
	private String empName;
	
	@Column(name = "emp_salary")
	private Float empSalary;
	
	@Column(name = "emp_phone",length = 12,unique = true)
	private String empPhone;
	
	@Column(name = "emp_mail",length = 50, unique = true , nullable = true)
	private String empMail;
	
	@OneToOne	
	private Address address;
}
