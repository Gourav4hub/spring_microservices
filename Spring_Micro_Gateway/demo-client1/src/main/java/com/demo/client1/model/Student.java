package com.demo.client1.model;

import java.io.Serializable;

public class Student implements Serializable {
	private String title;
	private int age;
	public Student() {
	}
	
	public Student(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [title=" + title + ", age=" + age + "]";
	}
	
	
}
