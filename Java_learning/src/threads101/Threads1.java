package threads101;

public class Threads1 extends Thread {
	
	// Only run method has start and stop capabilities as it is the inbuilt method of Thread class
	
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println("251");
		}
	}

}
