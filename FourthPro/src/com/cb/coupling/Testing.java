package com.cb.coupling;

public interface Testing {
	void hello();
	
	public default void execute() 
	{
		System.out.println("Testing Execute !");
	}
	
	public static void exe() {
		
	}
}
