package com.cb.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) 
	{
		Class cls = Student.class;	
		
		
		
		Field fl[] =  cls.getDeclaredFields();
		for(Field f  : fl) 
		{
			String nm = f.getName();
			String ty = f.getType().toString();
			int m = f.getModifiers();
			System.out.println(nm + " : " + ty + " : " + m);
			
			
		}
		System.out.println("*********************************");
		
		Method mt[] = cls.getDeclaredMethods();
		for(Method m : mt) 
		{
			String nm = m.getName();
			String ty = m.getReturnType().toString();
			int mo = m.getModifiers();
			int c = m.getParameterCount();
			System.out.println(nm + " : " + ty + " : " + mo + " : " + c);
			Parameter p[] = m.getParameters();
			for(Parameter pp : p) 
			{
				System.out.println(pp.getName() + pp.getType().toString());
			}
			
			
		}
		
		
		
		
	}

}
