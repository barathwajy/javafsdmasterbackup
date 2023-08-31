package garbagecollection101;

public class Daemonda extends Thread{
	
	public Daemonda(String string) {
		// TODO Auto-generated constructor stub
	}

	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	public static void main(String args[])
	{
		Daemonda d1 = new Daemonda("t1");
		Daemonda d2 = new Daemonda("t2");
		Daemonda d3 = new Daemonda("t3");
		
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.setDaemon(true);
		d3.start();

	}
	
}
