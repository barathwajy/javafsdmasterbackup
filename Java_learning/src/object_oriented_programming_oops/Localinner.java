package object_oriented_programming_oops;


class outers
{	// class -> method -> class - Method
	// the inner class should be initialised within outer class
	
	 void getdata()
	{
		int sum=0;
		
		class inner
		{
			void di()
			{
				System.out.println("i am the func of ");
			}
		}
		inner n1 = new inner();
		n1.di();
		
	}
}
public class Localinner {
	public static void main(String args[])
	{
		//class inside a method
		outers o1 = new outers();
		o1.getdata();
		
	}
}
