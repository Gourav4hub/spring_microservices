package com.cb.fourth;

import com.cb.coupling.Testing;

public class Sample extends Demo implements Test,Testing
{

	@Override
	public void hello() {
			System.out.println("Sample Hello .... ");	
	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Testing.super.execute();
		Test.super.execute();
		
	}

}
