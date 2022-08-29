package com.pataa.first;

public class Pro1 
{

	public static void main(String[] args) 
	{
		System.out.println("Program Start .....");
		
		Employee emp1 = new Employee(); // Reference
		Employee emp2 = new Employee(); 
		Employee emp3 = new Employee(); 
		//System.out.println(emp);
		
		emp1.input();
		emp2.input();
		emp3.input();
		
		emp1.show();
		emp2.show();
		emp3.show();
	}

}

/*
 	byte 1, short 2, int 4, long 8
 	float  4, double 8
 	boolean 1
 	char 2
 	
 	reference : null
*/