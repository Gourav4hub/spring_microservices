package com.cb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro2 {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Student ob1 = (Student)ctx.getBean("b1");
		Student ob2 = (Student)ctx.getBean("b2");
		Student ob3 = (Student)ctx.getBean("b3");
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		
	}
}
