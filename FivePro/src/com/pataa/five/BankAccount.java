package com.pataa.five;

public class BankAccount 
{
	private String name;
	private float balance;
	
	public BankAccount(String name, float balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void withdraw(float amount) // 10000 40000 25000 10000
	{
		if(amount>this.balance)
			System.err.println("Amount Not Withdraw; Balance : " 
						+ this.balance + " Amount : " + amount);
		else {
			this.balance -= amount;
			System.out.println("Amount Withdraw; Balance : " 
					+ this.balance + " Amount : " + amount);	
		}
	}
	
	public synchronized void deposit(float amount) {
		this.balance += amount;
		System.out.println("Amount Deposit; Balance : " 
				+ this.balance + " Amount : " + amount);	
	
	}
}
