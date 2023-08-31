package testing_d;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit_test_demo.Demotest;

public class Beforeafter {
	
	Demotest d1;
	@BeforeEach
	public void before()
	{
		d1 = new Demotest();
		System.out.println("everytime I run , when I am used beforeeach annotation");
	}
	
	@AfterEach
	public void after()
	{
		System.out.println("end of test case");
	}
	
	
	
	
	
	
	@Test
	@DisplayName("Negative Test")
	
	public void Test1()
	{
	//	//Demotest d1 = new Demotest();
		System.out.println(d1.add(-10,20));
//		int a = d1.add(-10, 20);
		//assertEquals(a,30);
	}
	
	@Test
	@DisplayName("Postive Test")
	public void Test2()
	{
		//Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}
	
	@Test
	@DisplayName("Postive Test")
	public void Test3()
	{
		//Demotest d1 = new Demotest();
		System.out.println(d1.add(123,20));
	}
	
	
	

	
}
