package com.pataa.second;

import java.util.Scanner;

public class Student 
{
	public static final String BRANCHES[] = {"CS","EC","ME"};
	
	private int roll;
	private String name;
	private String branch;
	private Address address;
	private ExamRecord exams[];
	private int examCounter;
	
	public Student() {
		//this.address = new Address();
		this.exams = new ExamRecord[5];
	}

	public void input() 
	{
		Scanner sc = new Scanner(System.in); // Use-A
		System.out.print("Roll : "); this.roll = sc.nextInt();
		System.out.print("Name : "); this.name = sc.next();
		System.out.print("Branch : ");
		for(int i=0; i<BRANCHES.length; i++) 
		{
			System.out.print(BRANCHES[i] + " : " + (i+1) + " ");
		}
		System.out.print(">>> ");
		 this.branch = BRANCHES[sc.nextInt()-1];
		 //this.address.inputAddress();
	}
	public void addAddress() {
		this.address = new Address();
		this.address.inputAddress();
	}
	public void addExamRecord() 
	{
		ExamRecord rec = new ExamRecord();
		rec.inputRecord();
		this.exams[this.examCounter] = rec;
		this.examCounter++;
	}
	public void show() 
	{
		System.out.println("\nRoll : " + this.roll);
		System.out.println("Name : " + this.name);
		System.out.println("Branch : " + this.branch);
		
		if(this.address==null)
			System.out.println("Address Not Defined !");
		else
			this.address.showAddress();
		
		if(this.examCounter==0)
				System.out.println("Exam Not Added !");
		else
			for(int i=0; i<this.examCounter; i++)
				this.exams[i].showRecord();
	}
}
