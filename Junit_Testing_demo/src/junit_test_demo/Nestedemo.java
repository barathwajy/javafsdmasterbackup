package junit_test_demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Nestedemo {
	
	@Nested
	public class test1{
		@Test
		public void demo1()
		{
			System.out.println("Test - 1");
			Demotest d1 = new Demotest();
			int a1 = d1.add(90, 10);
			assertEquals(a1,1010);
		}
		@Test
		public void demo2()
		{
			System.out.println("Test - 2");
		}
	}
	
	@Nested
	public class test2{
		@Test
		public void demo3()
		{
			System.out.println("Test - 3");
		}
		@Test
		public void demo4()
		{
			System.out.println("Test - 4");
		}
	}
	
	

}