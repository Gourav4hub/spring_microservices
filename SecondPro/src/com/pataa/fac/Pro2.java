package com.pataa.fac;

public class Pro2 {

	public static void main(String[] args) 
	{
		Demo ob1 = Demo.getSingelton();
		Demo ob2 = Demo.getSingelton();
		Demo ob3 = Demo.getSingelton();
		Demo ob4 = Demo.getSingelton();
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
	}

}
