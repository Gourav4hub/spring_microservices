package com.cb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pro1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Demo ob1 = ctx.getBean(Demo.class);
		
		System.out.println(ob1);

	}

}
