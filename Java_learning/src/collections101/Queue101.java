package collections101;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue101 {
	
	public static void main(String args[]) throws InterruptedException
	{
		/*
		 *  Has definite memory space program wont execute when the capacity is breached
		 *  
		 */
		ArrayBlockingQueue<String> b1 = new ArrayBlockingQueue<String>(5);
		b1.put("1");
		b1.put("2");
		b1.put("3");
		b1.put("4");
		System.out.println(b1);
		b1.remove();
		b1.put("5");
		System.out.println(b1);
		b1.put("6");
		System.out.println(b1);
		b1.remove();
		System.out.println(b1);
		
		LinkedBlockingQueue<String> lq = new LinkedBlockingQueue<String>(b1);
		lq.put("dem");
		lq.put("dem1");
		lq.put("dem1");
		System.out.println(lq);
	}

}
