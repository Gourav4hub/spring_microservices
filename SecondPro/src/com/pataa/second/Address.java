package com.pataa.second;

import java.util.Scanner;

public class Address 
{
	private String street;
	private String landmark;
	private String city;
	private String pincode;
	
	public void inputAddress() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Street : "); this.street = sc.nextLine();
		System.out.print("Landmark : "); this.landmark = sc.nextLine();
		System.out.print("City : "); this.city = sc.next();
		System.out.print("Pincode : "); this.pincode = sc.next();
	}
	public void showAddress() 
	{		
		System.out.println("Street : " + this.street);
		System.out.println("Landmark : " + this.landmark);
		System.out.println("City : " +this.city);
		System.out.println("Pincode : " + this.pincode);
	}
}
