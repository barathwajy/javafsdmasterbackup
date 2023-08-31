package demo_oops_pojo;

class th1
{
	int a;
	int b;
	// anonymous constructors work by default {} like a block of code
	// where as constructors needs a name that 
	th1()
	{
		System.out.println("constructor");
	}
	th1(int a1, int b1)
	{
		// this this calls the default constructor 
		this();
		
		a = a1;
		b = b1;
		System.out.println(a+b);
		
	}
	th1(int ...n){
		this();
		System.out.println("HELLOOOO");
	}
}
public class Thiskeyword {

	public static void main(String args[])
	{
		th1 t1 = new th1(10,5);
		
	}
	
	
}
