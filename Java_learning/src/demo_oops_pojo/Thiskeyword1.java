package demo_oops_pojo;
class test
{
	int a;
	int b;
	test()
	{
		this.a=10;
		this.b=20;
	}
	
	test get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
}
public class Thiskeyword1 {

	public static void main(String[] args)
	{
		test t1 = new test();
		t1.get().display();
	}
	
}
