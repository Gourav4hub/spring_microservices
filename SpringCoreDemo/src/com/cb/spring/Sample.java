package com.cb.spring;

import java.util.List;

public class Sample
{
	private List<Student> studlist;

	public List<Student> getStudlist() {
		return studlist;
	}

	public void setStudlist(List<Student> studlist) {
		this.studlist = studlist;
	}

	@Override
	public String toString() {
		return "Sample [studlist=" + studlist + "]";
	}
	
	
}
