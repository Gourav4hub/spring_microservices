package com.cb.thread;

public class MyDemo2 implements Runnable
{
	private String title;
	public MyDemo2(String title) {
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
