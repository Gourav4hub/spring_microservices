package com.pataa.second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Pro2 {

	public static void main(String[] args) {
		
		// Insertion Order Maintain , Deplicate Value Allow , Indexing Allow
		ArrayList<String> list = new ArrayList<>(1000); // Array : 10 Size
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Pooja");
		list2.add("Lokesh");
		
		list.add("Vikas");
		list.add("Mohan");
		list.add(1,"Meena");
		list.add("Gopal");
		list.addAll(2,list2);
		
		System.out.println(list);
		
		
	}
}

//Collection
//
//List     			Set   		Queue
//
//	ArrayList		HashSet
//	LinkedList		TreeSet
//	Vector
