package com.cb.collect;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro1 {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		
//		List<Student> l1 = list;
//		Queue<Student> q1 = list;
//		Deque<Student> dq1 = list;
		
		list.add(new Student(212, "Vikas"));
		list.add(new Student(211, "Gopal"));
		list.add(new Student(223, "Ashok"));
		list.add(new Student(202, "Dheeraj"));
		list.add(new Student(245, "Mohan"));
		
		System.out.println(list);
		
		
//		list.sort(new Comparator<Student>() 
//		{
//			@Override
//			public int compare(Student ob1, Student ob2) 
//			{
//				return ob1.getRoll() - ob2.getRoll();
//			}
//		});
		
//		list.sort(new Comparator<Student>() 
//		{
//			@Override
//			public int compare(Student ob1, Student ob2) 
//			{
//				return ob1.getName().compareTo(ob2.getName());
//			}
//		});
		
		list.sort((ob1,ob2)->ob1.getRoll()-ob2.getRoll());
		
		System.out.println(list);
	}

}
