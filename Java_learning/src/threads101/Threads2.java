package threads101;

public class Threads2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
