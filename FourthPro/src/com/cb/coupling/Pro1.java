package com.cb.coupling;

import com.cb.fourth.Sample;

public class Pro1 {

	public static void main(String[] args) {
		
		ABC abc = new ABC();
		Sample sam = new Sample();
		
		XYZ ob = new XYZ(sam);
		
		ob.run();
	}

}
