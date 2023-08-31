package garbagecollection101;

class Test
{
	public void finalize()
	{
		System.out.println("space cleared");
	}
}
public class Testgarb {

		public static void main(String args[])
		{
			Test t1=new Test();
			Test t2 = new Test();
			t1=null;
			t2=null;
			
			System.gc();
		}
}
