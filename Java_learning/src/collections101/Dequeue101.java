package collections101;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Dequeue101 {
	
	public static void main(String [] args)
	{
		
		Deque<Integer> d1 = new ArrayDeque<>();
		d1.addFirst(12);
		d1.addLast(100);
		d1.addLast(21);
		d1.pollFirst();
		System.out.println(d1);
		
		
	
		Deque<Integer> d2 = new LinkedList<>();
		
	}
}
