package com.pataa.five;

public class Pro2 {

	public static void main(String[] args) {
		
		String name = "Vikas"; // immutable		
		name = "Raj";		
		String s = name.toUpperCase();
		System.out.println(name);
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("Vikas"); // Thread Safe : sychronized
		StringBuilder s2 = new StringBuilder("Vikas"); // No Thread Safe
		
		s1.append(" Kumar");
	}

}
