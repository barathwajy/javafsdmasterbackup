package interfacesdemo;

interface name{
	int a=10; // fixed values cannot be changed elsewhere
	void demo1();
	void disp();
}
// Cannot leave anything whatever method declared 
// should be used here.
//
// 
// 
class de1 implements name
{

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("demo on interface"+" "+this.a);
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	
}

class de2 implements name
{

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("demo on interface");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	
}
public class Demointer1 {
	
	public static void main(String [] args)
	{
		de1 d1 = new de1();
		d1.demo1();
		name n1 = new de2();
		n1.demo1();
	}
}
