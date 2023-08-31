package demo_oops_pojo;

class thisss
{
	void disp()
	{
		this.get();
		System.out.println("i am a disp method");
	}
	
	void get()
	{
		System.out.println("I am get method");
	}
	
}
public class Thiskeyword3 {
	public static void main(String args[])
	{
		thisss t1 = new thisss();
		t1.disp();
	}

}
