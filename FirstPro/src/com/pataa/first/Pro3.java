package com.pataa.first;

public class Pro3 {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(101,"Vikas",12000);
		
		//Employee emp2 = emp1;
		Employee emp2 = new Employee(emp1);
				
		emp1.show();
		System.out.println(emp1.hashCode());
		
		emp2.show();
		System.out.println(emp2.hashCode());
	}

}
