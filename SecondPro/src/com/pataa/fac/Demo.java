package com.pataa.fac;

import java.util.Scanner;

public class Demo 
{
	private static Demo obj;
	
	private String title;
	private int num;
	
	private Demo() {}
	
	// Factory Method
	public static Demo getObject() {
		return new Demo();
	}
	
	public static Demo getSingelton() {
		if(Demo.obj==null)
			Demo.obj = new Demo();
		return Demo.obj;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Title : "); this.title = sc.nextLine();
		System.out.print("Number : "); this.num = sc.nextInt();
	}
	public void show() {
		System.out.println("\nTitle : "  + this.title);		
		System.out.println("Number : " + this.num);
	}	
}
