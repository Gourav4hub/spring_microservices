package com.cb.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Pro2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Student ob = new Student(101,"Vikas");
		
		Class cls = Student.class;
		
		Method mth = cls.getDeclaredMethod("show", null);
		
		mth.setAccessible(true);
		
		mth.invoke(ob, null);
		
				
	}

}
