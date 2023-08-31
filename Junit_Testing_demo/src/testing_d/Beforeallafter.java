package testing_d;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit_test_demo.Demotest;

public class Beforeallafter {
	
	
	@BeforeAll
	public static void demobeforall()
	{
		System.out.println("hi welcome to demo junit...........");
	}
	
	@AfterAll
	public static void demoafterall()
	{
		System.out.println("Bye");
	}
	
	
	@Test
	
	public void demo1()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}
	
	
	@Test
	public void demo2()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}
	
	@Test
	public void demo3()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}
	
	
	
	

}
