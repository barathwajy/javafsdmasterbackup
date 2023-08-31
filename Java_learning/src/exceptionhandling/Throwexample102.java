package exceptionhandling;

public class Throwexample102 {
	static void demo() throws ArrayIndexOutOfBoundsException, ArithmeticException
	{
		int a1[] = new int[10];
		a1[11] = 7897;
		System.out.println(a1[11]);
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String args[])
	{
		try
		{
			demo();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("continue....................");
	}

}
