package testing_d;

import java.util.concurrent.TimeUnit;

//import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Timerdemo {
	
	@Test
	@Timeout(4)
	public void assum() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.print("OTP....");
		
	}
	
	@Test
	@Timeout(6)
	public void assum1() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(5);
		System.out.print("correct....");
		
	}
}
