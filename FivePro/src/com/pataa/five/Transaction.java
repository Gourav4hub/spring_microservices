package com.pataa.five;

public class Transaction extends Thread
{
	public static final int TYPE_WITHDRAW = 1;
	public static final int TYPE_DEPOSIT = 2;
	
	private BankAccount account;
	private float amount;
	private int type;	
	
	public Transaction(BankAccount account, float amount, int type) {
		super();
		this.account = account;
		this.amount = amount;
		this.type = type;
	}

	@Override
	public void run() 
	{
		if(this.type == Transaction.TYPE_WITHDRAW)
			this.account.withdraw(this.amount);
		else
			this.account.deposit(this.amount);
	}
}
