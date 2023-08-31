package collections101;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Iter1 {
	
	public static void main(String args[])
	{
		List<Integer> l1 = new LinkedList<>();
		
		
		l1.add(1);
		l1.add(100);
		l1.add(23);
		
		
		Iterator<Integer> list = l1.iterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
	
		
	}

}
