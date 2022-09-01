package com.cb.coupling;

import java.io.Serializable;

public class XYZ implements Serializable
{
	private Testing abc;
	
	public XYZ(Testing abc) {
		super();
		this.abc = abc;
	}

	public void run() {
		System.out.println("XYZ Run ....");
		this.abc.hello();
		this.abc.execute();
		//this.abc.fun3();
	}
}
