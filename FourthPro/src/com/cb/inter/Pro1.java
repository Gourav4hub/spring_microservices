package com.cb.inter;

import com.cb.coupling.XYZ;
import com.cb.fourth.Sample;

public class Pro1 {

	public static void main(String[] args) 
	{
		XYZ xyz = new XYZ(new Sample());
//		MyInterface ob1 = new MyInterface() 
//		{			
//			@Override
//			public void run() {
//				System.out.println("Run....");
//			}			
//			@Override
//			public void hello() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello .....");
//			}			
//		};
//		
//		ob1.run();
//		ob1.hello();
		
//		MyInterface ob1 = new MyInterface() {			
//			@Override
//			public void run() {
//				System.out.println("Run.....");
//			}
//		};
//		ob1.run();
//		
//		MyInterface ob3 = new MyInterface() {			
//			@Override
//			public void run() {
//				System.out.println("Run.....");
//			}
//		};
//		ob3.run();
		
		
		// Lambda
		MyInterface ob2 = ()->{
				System.out.println("Running...... ");
				xyz.run();
		};	
		ob2.run();
		
		
	}

}
