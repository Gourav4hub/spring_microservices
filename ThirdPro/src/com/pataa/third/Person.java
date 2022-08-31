package com.pataa.third;

import java.util.Scanner;

public class Person 
{
	private String name;
	private int age;
	private String contact;
	
	public Person() {
		System.out.println("Person Constructor Run ..... ");
	}
	
	
	
	public Person(String name, int age, String contact) {		
		this.name = name;
		this.age = age;
		this.contact = contact;
	}



	public void show() 
	{
		System.out.println("\nName : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Contact : " + this.contact);
	}	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Name : "); this.name = sc.nextLine();
		System.out.print("Age : ");  this.age = sc.nextInt();
		System.out.print("Contact : "); this.contact=sc.next();
	}
	
	public void takeLunch() {
		System.out.println("Lunch Time 11:00AM !");
	}
	
	public final void canVote() {
		if(this.age>=18)
			System.out.println("Can Vote !");
		else
			System.out.println("Can Not Vote !");
	}
}
