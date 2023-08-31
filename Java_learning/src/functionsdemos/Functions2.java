package functionsdemos;

public class Functions2 {
	
	public void fun11(Integer n1)
	{
		System.out.println("fun11(Integer n1)");
	}
	
	// Wrapper class can take null values 
	// By that the method is running based on the class defined 

	public void fun11(String n1)
	{
		System.out.println("fun11(String n1)");
	}
	
	public static void main(String args[])
	{
		Functions2 f1 = new Functions2();
		Integer a1 = null;
		f1.fun11(a1);
		
		
	}
}
