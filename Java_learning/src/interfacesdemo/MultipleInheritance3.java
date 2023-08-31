package interfacesdemo;

interface mull
{
	default void display()
	{
		System.out.println("interface function..");
	}
}


class muller implements mull
{
	
}



public class MultipleInheritance3 implements mull {
	public static void main(String args[])
	{
		
		mull i = new muller();
		i.display();
		
		MultipleInheritance3 m = new MultipleInheritance3();
		m.display();
	}

}
