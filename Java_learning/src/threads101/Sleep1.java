package threads101;

class demo1 extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
public class Sleep1 {

	public static void main(String args[]) throws InterruptedException
	{
		demo1 d1 = new demo1();
		//System.out.println(d1.getState());
		d1.start();
		System.out.println(d1.getState());
		d1.sleep(1000);
		System.out.println(d1.getState());
	}
}
