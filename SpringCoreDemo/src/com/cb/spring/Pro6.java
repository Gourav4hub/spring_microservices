package com.cb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro6 {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Test d1 = (Test)ctx.getBean("t1");
		Test d2 = (Test)ctx.getBean("t2");
		
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
