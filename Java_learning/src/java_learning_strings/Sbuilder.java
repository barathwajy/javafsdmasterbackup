package java_learning_strings;
public class Sbuilder {
	
	public static void main(String args[])
	{
		
		StringBuilder s1 = new StringBuilder(10);
		s1.append("java");
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		char a1 = s1.charAt(1);
		System.out.println(a1);
		int n1 = s1.codePointAt(0);
		System.out.println(n1);
		int n2 = s1.codePointCount(0, 3);
		System.out.println(n2);
	}

}
