package com.pataa.first;

import java.util.Scanner;

public class Employee 
{
	// Features : Instance Variables
	private int empId;    
	private String empName;
	private float empSalary;
	
	// Static Block
	static{
		System.out.println("Static block .... ");
	}
	
	// Initialization Block
	{
		System.out.println("Init Block .... ");
	}
	
	// Constructor
	public Employee() {}	
	public Employee(int empId , String empName , float empSalary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		// code
	}	
	public Employee(int empId , String empName) 
	{
		this.empId = empId;
		this.empName = empName;		
	}	
	public Employee(Employee emp) {
		this.empId = emp.empId;
		this.empName = emp.empName;
		this.empSalary = emp.empSalary;
	}
	
	public float getEmpSalary() {return this.empSalary;}
	public void setEmpSalary(float empSalary) { 
		// conditions
		this.empSalary = empSalary;
	}
		
	// Methods
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Id : "); this.empId = sc.nextInt();
		System.out.print("Name : "); this.empName = sc.next();
		System.out.print("Salary : "); this.empSalary = sc.nextFloat();
		//sc.close();
	}
	public void show() 
	{
		System.out.println("\nID : " + this.empId);
		System.out.println("Name : " + this.empName);
		System.out.println("Salary : " + this.empSalary);
	}
}
