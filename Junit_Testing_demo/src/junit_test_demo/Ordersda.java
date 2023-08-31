package junit_test_demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class Ordersda {

	@Test
	@DisplayName("Negative Test 1 ")
	@Order(3)
	public void Test1()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(-10,20));
//		int a = d1.add(-10, 20);
		//assertEquals(a,30);
	}
	
	@Test
	@DisplayName("Postive Test 2")
	@Order(2)
	public void Test2()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(23,20));
	}
	
	@Test
	@DisplayName("Postive Test 3")
	@Order(1)
	public void Test3()
	{
		Demotest d1 = new Demotest();
		System.out.println(d1.add(123,20));
	}
}
