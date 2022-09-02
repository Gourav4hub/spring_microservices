package com.pataa.five;

public class Pro1 {

	public static void main(String[] args) {
		
		BankAccount act = new BankAccount("Vikas", 75000);
		
		Transaction t1 = new Transaction(act, 10000, Transaction.TYPE_WITHDRAW);
		Transaction t2 = new Transaction(act, 25000, Transaction.TYPE_WITHDRAW);
		Transaction t3 = new Transaction(act, 40000, Transaction.TYPE_WITHDRAW);
		Transaction t4 = new Transaction(act, 5000, Transaction.TYPE_WITHDRAW);
		Transaction t5 = new Transaction(act, 10000, Transaction.TYPE_WITHDRAW);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
