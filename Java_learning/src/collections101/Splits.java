package collections101;

import java.util.LinkedList;
import java.util.Spliterator;

class empdetails
{
	int eno;
	String name;
	public empdetails(int eno, String name)
	{
		super();
		this.eno = eno;
		this.name = name;
	}
}
public class Splits {
	
	public static void main(String args[])
	{
		LinkedList<empdetails> e1 = new LinkedList<empdetails>();
		e1.add(new empdetails(101,"a"));
		e1.add(new empdetails(102,"b"));
		
		System.out.println(e1.get(0).name);
		
		Spliterator<empdetails> s1 = e1.spliterator();
		//s1.
	}
	
}
