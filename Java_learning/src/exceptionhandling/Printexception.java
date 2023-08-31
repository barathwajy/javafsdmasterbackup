package exceptionhandling;

public class Printexception  {

	public static void main(String args[])
	{
		
		int a=5;
		int b=0;
		int []c = new int[5];
		try
		{
			 c[6]=7;
			//System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
			 //c = a/1;
		}
		finally
		{
			System.out.println(c.toString());
		}
		
		//System.out.println(a/b);
		System.out.println(c);
		
	}
}
