package com.cb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro1 {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Student ob1 = ctx.getBean(Student.class);
		Student ob2 = ctx.getBean(Student.class);
		Student ob3 = ctx.getBean(Student.class);
		Student ob4 = ctx.getBean(Student.class);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob4);
		
		
	}
}
