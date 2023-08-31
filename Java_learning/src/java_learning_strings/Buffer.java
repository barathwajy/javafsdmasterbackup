package java_learning_strings;


public class Buffer {
	
	public static void main(String args[])
	{
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("java");
		s1.append(" ");
		s1.append("welcome:");
		String info =s1.toString();
		System.out.println(s1.capacity());
		
		System.out.println(info);
		
		s1.insert(4, "python");
		System.out.println(s1.capacity());
		System.out.println(s1);
		s1.replace(4, 6, "c++");
		System.out.println(s1);
		s1.delete(4,6);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
	
	}

}
