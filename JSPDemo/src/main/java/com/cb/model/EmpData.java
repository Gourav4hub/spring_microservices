package com.cb.model;

public class EmpData 
{
	private int id;
	private String name;
	private String phone;
	private String email;
	private String city;
	private float salary;
	
	public EmpData(int id, String name, String phone, String email, String city, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public float getSalary() {
		return salary;
	}
	
	
}
