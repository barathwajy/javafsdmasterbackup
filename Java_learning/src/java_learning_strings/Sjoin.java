package java_learning_strings;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Sjoin {
	
	public static void main(String args[])
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("class");
		a1.add("for");
		a1.add("Core");
		System.out.println(a1);
		StringJoiner s2 = new StringJoiner(",");
		s2.add(a1.get(0)).add(a1.get(1));
		System.out.println(s2);
		
	}
}
