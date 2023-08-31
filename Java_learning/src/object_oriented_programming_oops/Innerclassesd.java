package object_oriented_programming_oops;


class outer{
	static int a=10;
	int b=20;
	class inner{
		void display()
		{
			System.out.println(a+b);
		}
	}
	//// Static class example for comparison 
	static class inner1{
		static int b=10;
		void display() {
			System.out.println((a+b)+3);
		}
	}
	//// Static class example for comparison 
}
public class Innerclassesd {
	// inner classes types - Local Innerclass and Anonymous innerclass
	public static void main(String args[])
	{
		outer o1 = new outer();
		System.out.println(o1.a);
		//outer.inner ot = new outer.inner(); 
		// Static classes have own spaces but for nonstatic classes
		// we need to make them share the spaces of the outer class
		outer.inner oi = o1.new inner();
		oi.display();
		
		//Static class reference
		outer.inner1 i1 = new outer.inner1();
		i1.display();
		
	}

}
