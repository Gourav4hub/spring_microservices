package com.cb.collect;

import java.util.LinkedList;
import java.util.function.Consumer;

public class Pro10 {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		
		list.add(new Student(212, "Vikas"));
		list.add(new Student(211, "Gopal"));
		list.add(new Student(223, "Ashok"));
		list.add(new Student(202, "Dheeraj"));
		list.add(new Student(245, "Mohan"));
		
//		list.forEach(new Consumer<Student>() 
//		{
//			@Override
//			public void accept(Student ob) {
//				System.out.println(ob);
//			}
//		});
		
		list.forEach(ob->System.out.println(ob));
	}

}
