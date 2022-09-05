package com.cb.collect;

import java.util.HashSet;
import java.util.TreeSet;

public class Pro3 {

	public static void main(String[] args) {
		// TreeSet : 	1. Not Allow Duplicate Value 
				//		 2. Insertion Order Not Maintain but sorted order
				//		 3. No Indexing Support
				
		TreeSet<String> set = new TreeSet<>();
	
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
