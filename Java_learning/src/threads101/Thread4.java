package threads101;

public class Thread4 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				
				Thread.sleep(500);
				// suspicious code - that may cause exception 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
		
		
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread4 t4 = new Thread4();
		Thread4 t5 = new Thread4();
		t4.start();
		t5.start();
		
	}
	
}

