package com.cb.office.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cb.office.model.EmployeeModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "emp_info")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "empId")
public class Employee 
{
	public Employee(EmployeeModel empModel) 
	{
		this.empId = empModel.getId();
		this.empName = empModel.getName();
		this.empPhone = empModel.getPhone();
		this.empMail = empModel.getMail();
		this.empSalary = empModel.getSalary();
	}

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
	
	@OneToMany(mappedBy = "employee")
	private List<Address> addresses;
}
