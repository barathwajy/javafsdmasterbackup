package collections101;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class List101 {

	/*
	 * Abstract list
	 * sequntinal
	 * arraylist
	 * stack
	 * linkedlist
	 */
	public static void main(String args[])
	{
		// Abstract List comes under abstract class of Interface
		AbstractList<Integer> ab1 = new ArrayList<Integer>();
		ab1.add(121);
		ab1.add(122);
		ab1.add(123);
		ab1.add(124);
		
		
		AbstractSequentialList<Integer> ab2 = new LinkedList<Integer>();
		
		//ArrayList
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(5);
		
		a1.add(1);a1.add(2);a1.add(3);a1.add(4);a1.add(5);
		
		
		ArrayList<Object> a2 = new ArrayList<Object>();
		a2.add("kavitha");
		a2.add(92);
		a2.add(9.9);
		System.out.println(a2);
		Collections.shuffle(a1);
		System.out.println(a1);
		Random r1 = new Random();
		
		for(int i=0;i<a1.size();i++)
		{
			int x = (int)(Math.random()*a1.size());
			System.out.println(a1.get(x));
		}
				
		// Vector
		Vector<Object> a3 = new Vector<Object>();
		Vector<Integer> a33 = new Vector(2,3);
		a33.insertElementAt(12, 0);;
		System.out.println(a33);
		
		Vector v1 = new Vector();
		v1.add('a');
		v1.add(99);
		v1.set(1, 100);
		v1.insertElementAt(2000, 0);
		System.out.println(v1);
		
	
	}
	
	

	
	
	
	
	
}
