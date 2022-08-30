package com.pataa.second;

import java.util.Scanner;

public class ExamRecord 
{
	private String title;
	private float totalMarks;
	
	public void inputRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Exam Title : "); this.title = sc.nextLine();
		System.out.print("Total Marks : "); this.totalMarks = sc.nextFloat();
	}
	public void showRecord() {
		System.out.println("\nExam Title : "  + this.title);		
		System.out.println("Total Marks : " + this.totalMarks);
	}
}
