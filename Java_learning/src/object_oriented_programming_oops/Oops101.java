package object_oriented_programming_oops;

class Demo{
	
	void display1()
	{	
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
	
	static class Demo1
	{
	
	int a=10;
	int b=20;
	void display()
	{
		System.out.println(a+b);
	}
	
	}

}
public class Oops101 { // Called as Block
	
	
	public static void main(String args[])
	{	
		Demo.Demo1 d1 = new Demo.Demo1();
		
		Demo d2 = new Demo();
		d1.a =100;
		d1.b=25;
		d1.display();
		d2.display1();
		
		
	}
	

}
/*
class a1 extends Demo{
	
}
*/