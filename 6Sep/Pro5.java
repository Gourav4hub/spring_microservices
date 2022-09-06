class Demo
{
	public static void main(String args[])
	{
		C c = new C();
		c.funC();
	}	
}

class A
{
	public int funA(){
  	    try{
		int z = 45 / 56;
		return z;
		}catch(Exception ex){
			// ???
			//throw ex;	
			throw new RuntimeException("Message......");
		}
	}
}
class B
{
	public void funB(){
		A a = new A();
		int z = a.funA();
		int aa = z * 10;
		
	}
}
class C
{
	public void funC(){
		B a = new B();
		a.funB();
	}
}






Shyam / Ram

	Ram >>> 1.   2.   3.	




















