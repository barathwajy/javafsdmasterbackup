package testing_d;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptiondemo {
	
	@Test
	public void assum()
	{
		Assumptions.assumeTrue(false);
		System.out.print("correct....");
		
	}
	
	@Test
	public void assum1()
	{
		Assumptions.assumeFalse(true);
		System.out.print("correct 1....");
		
	}

}
