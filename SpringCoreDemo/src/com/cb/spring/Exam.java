package com.cb.spring;

public class Exam 
{
	private Student stud;
	private String title;
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Exam [stud=" + stud + ", title=" + title + "]";
	}
	
	
}
