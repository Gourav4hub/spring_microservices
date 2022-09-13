package com.cb.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Demo 
{
	@Autowired
	private Student student;
	
	@Autowired
	private Sample sample;

	@Override
	public String toString() {
		return "Demo [student=" + student + ", sample=" + sample + "]";
	}

	
}
