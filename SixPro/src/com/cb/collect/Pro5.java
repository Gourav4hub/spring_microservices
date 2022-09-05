package com.cb.collect;

import java.util.TreeSet;

public class Pro5 {

	public static void main(String[] args) 
	{
		
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(101, "Vikas"));
		set.add(new Student(134, "Gopal"));
		set.add(new Student(100, "Mahesh"));
		set.add(new Student(156, "Raj"));
		set.add(new Student(143, "Meena"));
		
		System.out.println(set);
	}

}
