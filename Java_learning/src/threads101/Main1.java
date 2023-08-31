package threads101;

public class Main1 implements Runnable{
	public static Thread t1;
	public static Main1 m1;
	public static void main(String args[])
	{
		m1 = new Main1();
		t1 = new Thread(m1);
		System.out.println(t1.getState());
		t1.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Threads3 mt = new Threads3();
		Thread mt1 = new Thread(mt);
		System.out.println(mt1.getState());
		mt1.start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(t1.getState());
		try {
			mt1.join();
			System.out.println(mt1.getState());		}
		catch(InterruptedException e)
		{
			System.out.println(t1.getState());
			System.out.println(e);
		}
		System.out.println(mt1.getState());
	}
}
