package exceptionhandling;

public class Throwexample1010 {

	static void demo()
	{
		try 
		{
			throw new NullPointerException("no space to null");
		}
		catch(Exception e)
		{
			System.out.print("inside da");
			throw e;
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			
			demo();
		}
		catch(NullPointerException e)
		{
			System.out.println();
			System.out.println(e);
		}
	}
}
