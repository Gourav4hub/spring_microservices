package com.cb.collect;

import java.util.Iterator;
import java.util.LinkedList;

public class Pro9 {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<>();

		list.add(new Student(212, "Vikas"));
		list.add(new Student(211, "Gopal"));
		list.add(new Student(223, "Ashok"));
		list.add(new Student(202, "Dheeraj"));
		list.add(new Student(245, "Mohan"));
		
		System.out.println(list);
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext())
		{
			Student s = itr.next();
			// itr.remove();
		}
		
	
	}

}
