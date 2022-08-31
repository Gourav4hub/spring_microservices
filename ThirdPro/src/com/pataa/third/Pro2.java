package com.pataa.third;

public class Pro2 {

	public static void main(String[] args) {
		
		//Student s1 = new Student();
		Faculty s1 = new Faculty();
		
		execute(s1);
	}
	
	private static void execute(Person ob) 
	{
		ob.input();		
		ob.show();
		ob.takeLunch();
		ob.canVote();
		
		if(ob instanceof Student)
		{
		 Student ob2 = (Student) ob;		
		 ob2.giveExam();
		}
	}	
	private static void execute2(Faculty ob) 
	{
		ob.input();		
		ob.show();
		ob.takeLunch();
		ob.canVote();
	}

}
