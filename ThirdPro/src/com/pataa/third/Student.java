package com.pataa.third;

import java.util.Scanner;

public class Student extends Person
{
	private int roll;
	private float marks;
	
	public Student() {
		System.out.println("Student Constructor Run ..... ");
	}
	
	public Student(int roll, float marks) {		
		this.roll = roll;
		this.marks = marks;
	}
	
	public Student(String name, int age, String contact, int roll, float marks) {
		super(name, age, contact);
		this.roll = roll;		
		this.marks = marks;
	}

	public void show() 
	{
		super.show();
		System.out.println("Roll Number : " + this.roll);
		System.out.println("Marks : " + this.marks);
	}	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Roll Number : "); this.roll=sc.nextInt();
		System.out.print("Marks : "); this.marks=sc.nextFloat();
	}
	public void takeLunch() {
		System.out.println("Lunch Time 12:30PM !");
	}
	
	public void giveExam() {
		System.out.println("Give Exam ......");
	}
}
