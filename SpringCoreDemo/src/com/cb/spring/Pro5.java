package com.cb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro5 {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Sample d1 = ctx.getBean(Sample.class);
		
		System.out.println(d1);
		
		
	}
}
