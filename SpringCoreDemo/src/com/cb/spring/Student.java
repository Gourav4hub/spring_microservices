package com.cb.spring;

public class Student 
{
	private String name;
	private int age;
	private float marks;
	
	public Student(){
		System.out.println("Student Default Constructor Run .....");
	}
	
	public Student(String name, int age, float marks) {
		System.out.println("Student Para Constructor Run .....");
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public Student(String name, int age) {
		System.out.println("Student Para2 Constructor Run .....");
		this.name = name;
		this.age = age;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int sage) {
		this.age = sage;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "] + " + this.hashCode();
	}
	
}
