package testing_d;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import junit_test_demo.Demotest;

public class Assertdemo {

	@Test
	public void demo1()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
		int a =d1.add(23, 20);
		assertEquals(a,43);
	}
	
	
	@Test
	public void demo2()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
		int a =d1.add(23, 20);
		assertNotEquals(a,43);
	}
	
	@Test
	public void demo3()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}

	
}
