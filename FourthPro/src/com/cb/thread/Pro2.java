package com.cb.thread;

public class Pro2 {

	public static void main(String[] args) {
		MyDemo2 ob1 = new MyDemo2("Indore");
		MyDemo2 ob2 = new MyDemo2("Ujjain");
		MyDemo2 ob3 = new MyDemo2("Dewas");

		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
