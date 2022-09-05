package com.cb.reflect;

public class Student implements Comparable<Student>
{
	private int roll;
	public String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.roll + " : " + this.name;
	}

	@Override
	public int compareTo(Student ob) {		
		return this.roll - ob.roll;
	}
	
	private void show() {
		System.out.println(this.roll);
		System.out.println(this.name);
	}
}
