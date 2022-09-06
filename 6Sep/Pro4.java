class Demo
{
	public static void main(String args[])
	{
		//for(String s : args)
			//System.out.println(s);
		execute(args);
		
		System.out.println("Thanks ....");
	}
	
	private static void execute(String []args)
	{
		try 
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);	
		
			int z = x / y;
		
			System.out.println("Result : " + z);
		}		
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please Supply Two Values !");
		}
		catch(NumberFormatException ex){
			System.out.println("Please Supply Only Numbers !");
			return;
		}
		finally{
			System.out.println("Finally......");
		}
		
	}
}
