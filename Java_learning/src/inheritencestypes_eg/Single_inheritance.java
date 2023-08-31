package inheritencestypes_eg;

class Father{
	int num;
	String name;
	void display()
	{
		System.out.println("Father class");
	}
}
class Son extends Father{
	
	int num;
	String name;
	
	void display()
	{
		System.out.println("Son class");
	}
	
}

public class Single_inheritance {
	public static void main(String[] args)
	{
		Son s1 = new Son();
		Father f1 = new Father();
		s1.display();
		f1.display();
		
	}

}
