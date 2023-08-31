package collections101;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue102 {

	public static void main(String args[])
	{
		//PriorityQueue p1 = new PriorityQueue();
		PriorityBlockingQueue p1 = new PriorityBlockingQueue(2,Comparator.reverseOrder());
		p1.add(121);
		p1.add(5);
		p1.add(9);
		p1.add(6);
		p1.add(699);
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		
	}
}
