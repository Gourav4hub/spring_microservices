package com.pataa.first;

public class Pro4 {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(101,"Vikas",12000);
		
		float sal = emp1.getEmpSalary();
		System.out.println(sal);
		
		emp1.setEmpSalary(13000);
		
		emp1.show();
	}

}
