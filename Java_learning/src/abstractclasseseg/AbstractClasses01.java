package abstractclasseseg;



/*
 *  Abstract classes are similar to interfaces but here we can use the 
 *  methods either declaring or just by defining it alone i.e, we can have 
 *  both normal and abstract method
 *  
 *  It is also not compulsory to have abstract method
 *  
 *  
 *  We cannot create object for abstract classes
 *  
 *  Abstract method can only be declared inside abstract classes
 *  
 *  
 */
abstract class name1
{
	{
		System.out.println("hello def");
	}
	int a;
	abstract void display();
	void msg()
	{
		System.out.println("Hello");
	}
	final void msg2()
	{
		
	}
	static void msg1()
	{
		System.out.println("Hello static");

	}

}


class name2 extends name1
{

	int a;
	void msg()
	{
		System.out.println("Helo");
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class AbstractClasses01 extends name1{
	
	public static void main(String[] args)
	{
		
		name1 n1 = new name2();
		name1.msg1();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}

}
