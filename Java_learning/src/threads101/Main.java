package threads101;

public class Main {

	public static void main(String args[])
	{
		
		for(int i=0;i<8;i++)
		{
			Threads1 t1 = new Threads1();
			t1.start();
			
			
		}
		
		System.out.println("\n");
		
		for(int i=0;i<8;i++)
		{
			Thread t2 = new Thread(new Threads2());
			t2.start();
		}
		
	}
	
}
