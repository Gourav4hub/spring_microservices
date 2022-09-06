class Demo
{
	public static void main(String args[])
	{
		//for(String s : args)
			//System.out.println(s);
		try 
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);	
		
			int z = x / y;
		
			System.out.println("Result : " + z);
		}
		catch(Exception ex){						
			System.out.println("Error : " + ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please Supply Two Values !");
		}
		catch(NumberFormatException ex){
			System.out.println("Please Supply Only Numbers !");
		}
		
		
		System.out.println("Thanks ....");
	}
}
