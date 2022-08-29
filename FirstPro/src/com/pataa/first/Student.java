package com.pataa.first;

public class Student 
{
	// Class Variable / Static Variable
	public static String cname;
	private static int number;
	
	public static final String DATA = "Good Morning";

	static {
		 cname = "Pataa Navigation";
		 number = 100;
	}
	
	// Instance Variable
	private int roll;
	public String name;
	private float marks;
	
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public static int getNumber() {
		return number;
	}
	
	
}
