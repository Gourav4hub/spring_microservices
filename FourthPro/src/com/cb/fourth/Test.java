package com.cb.fourth;

public interface Test 
{
	int NUM=100;
	void fun3();
	
	public default void execute() 
	{
		System.out.println("Test Execute !");
	}
}
