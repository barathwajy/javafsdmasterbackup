package collections101;

import java.util.LinkedList;

public class Linkedlist101 {

		public static void main(String args[])
		{
			LinkedList<Object> l1 =new LinkedList<Object>();
			l1.add("karthika");
			l1.add(120);
			System.out.println(l1);
			
			l1.addFirst(12);
			l1.add(2,"k");
			l1.addLast(34);
			
			System.out.println(l1);
			l1.add(1,"an");
			System.out.println(l1);
			l1.set(2, "karthi.T");
			System.out.println(l1);
			l1.remove(2);
			System.out.println(l1);
			
			l1.removeFirst();
			l1.removeLast();
			System.out.println(l1);
			
			l1.offerLast(2);
			l1.offer(1);
			System.out.println(l1);
			
		}
}
