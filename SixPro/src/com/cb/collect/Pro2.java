package com.cb.collect;

import java.util.HashSet;

public class Pro2 {

	public static void main(String[] args) {
		
		// Set : 1. Not Allow Duplicate Value 
		//		 2. Insertion Order Not Maintain
		//		 3. No Indexing Support
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Vikas");
		set.add("Mohan");
		set.add("Gopal");
		set.add("Rajesh");
		set.add("Dheeraj");
		set.add("Mohan");
		set.add("Gopal");
		set.add("Rajesh");
		
		System.out.println(set);
		
		
	}

}

 
 






