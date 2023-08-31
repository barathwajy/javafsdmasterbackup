package exceptionhandling;

import java.io.IOException;

public class Propogation {

	
	static void f1() throws IOException
	{
		throw new java.io.IOException("hello");
	}
	static void f2()
	{
		try {
			f1();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	static void f3()
	{
		try 
		{
			f2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		f1();
	}
	
	
}
