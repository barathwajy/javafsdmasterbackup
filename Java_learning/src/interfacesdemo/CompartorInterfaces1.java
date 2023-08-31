package interfacesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * 
 * 
 * The Following code describes how to compare and sort the object
 * Object cannot be sorted directly i.e, I create a implement class to implement the 
 * class to compare the data of the main class based upon the comparator-(which is a built in interface)
 * Also we need a class that is from the comparator interface-(implements) which based 
 * on our condition holds the method which based on our condition that
 * we point to the inside contents of what the object holds and compares the object of the classes 
 * 
 * 
 */
class emp
{
	int eno;
	String ename;
	public emp(int eno, String ename)
	{
		super();
		this.eno =eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "emp [eno=" + eno + ", ename=" + ename + "]";
	}
	
}

class staff1 implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return o1.eno - o2.eno;
	}
	
}

class staff2 implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
	}
	
}

public class CompartorInterfaces1 {

		public static void main(String args[])
		{
			// to pass objects its better to go with either array or array list
			// arraylist is better choice when there is a mixture of data
			ArrayList<emp> e1 = new ArrayList<emp>();
			e1.add(new emp(105,"a"));
			e1.add(new emp(103,"c"));
			e1.add(new emp(102,"b"));
			e1.add(new emp(104,"d"));
			System.out.println(e1);
			Collections.sort(e1,new staff1());
			System.out.println(e1);
			Collections.sort(e1,new staff2());
			System.out.println(e1);
		}
}
