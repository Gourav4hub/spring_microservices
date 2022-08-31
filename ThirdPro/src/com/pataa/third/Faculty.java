package com.pataa.third;

import java.util.Scanner;

public class Faculty extends Person
{
	private int facid;
	private float salary;
	
	public void show() 
	{
		super.show();
		System.out.println("Faculty Id : " + this.facid);
		System.out.println("Salary : " + this.salary);
	}	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Facid  : "); this.facid=sc.nextInt();
		System.out.print("Salary : "); this.salary=sc.nextFloat();
	}
	public void takeExam() {
		System.out.println("Take Exam ......");
	}
}
