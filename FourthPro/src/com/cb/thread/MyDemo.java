package com.cb.thread;

public class MyDemo extends Thread
{
	private String title;
	public MyDemo(String title) {
		super();
		this.title = title;
	}
	
	@Override
	public void run() {
		this.execute();
	}
	
	public void execute() {
		for(int i=1; i<6;i++) {
			System.out.println(this.title + " : " + i);
		}
	}	
}
