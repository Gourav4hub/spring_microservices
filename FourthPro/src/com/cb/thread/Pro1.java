package com.cb.thread;

public class Pro1 {

	public static void main(String[] args) {
		MyDemo ob1 = new MyDemo("Indore");
		MyDemo ob2 = new MyDemo("Ujjain");
		MyDemo ob3 = new MyDemo("Dewas");

		ob1.start();
		ob2.start();
		ob3.start();
	}

}
