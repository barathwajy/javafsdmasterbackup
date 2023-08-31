package inheritencestypes_eg;



// Chaining of constructors

class A
{
	A(int a)
	{
		System.out.println("I am A class's function");
	}
	/*
	A()
	{
		System.out.println("A class const");
	}
	*/
}

class B extends A
{
	B(int a)
	{	super(a);
		System.out.println("I am B class const");
	}
	void disp()
	{
		System.out.println("I am func");
	}
}

class C extends B
{
	C(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	//super();
	void disp()
	{
		System.out.println("I am c class's function");
	}
	
}
public class Sampleinheritance {
	
	public static void main(String args[])
	{
		//B b1 = new B();
		C c1=new C(10);
		c1.disp();
	}

	
}
