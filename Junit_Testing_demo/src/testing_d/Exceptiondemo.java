package testing_d;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit_test_demo.Demotest;

public class Exceptiondemo {
	
	
	@Test
	public void Bank()
	{
		Demotest d1 = new Demotest();
		RuntimeException r1 = Assertions.assertThrows(RuntimeException.class, ()-> div(1,0));
		
		Assertions.assertEquals("nothing there", r1.getMessage());
		
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}

}
