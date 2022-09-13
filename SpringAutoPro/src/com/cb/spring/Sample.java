package com.cb.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Sample 
{
	private String title;
	
	public Sample() {
		this.title = "Pataa Navigation";
	}

	@Override
	public String toString() {
		return "Sample [title=" + title + "]";
	}
}
