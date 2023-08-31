package java_learning_strings;
public class Comparing {
	
	public static void main(String args[])
	{
		String n1 = "java";
		String n3 = "java";
		System.out.println(n1==n3);
		
		String n2 = new String("java");
		String n4 = new String("java");
		
		System.out.println((n1==n2)); // Different objects different memory 
		System.out.println((n1.equals(n2))); // check only values not memories 
		
		
		System.out.println(n2.isEmpty());
		
		String n5 = n4.intern();
		System.out.println(n5==n4); 
		
		//alter
		//String 
		
	}
}
