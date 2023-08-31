package collections101;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets101 {
	
	public static void main(String args[])
	{
		
		Set<Integer> a1 = new HashSet<Integer>();
		Set<Integer> a2 = new HashSet<Integer>();
		a1.add(1);
		a1.add(1);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		
		a1.addAll(Arrays.asList(new Integer[] {1,22,33,44,55,66,77}));
		a2.addAll(Arrays.asList(new Integer[] {11,22,33,44,55,66,77,1,2,3,4,5,6,7,8}));
		System.out.println(a1);
		System.out.println(a2);
		Set<Integer> u1 = new HashSet<Integer>(a1);
		u1.addAll(a2);
		System.out.println(a2);
		Set<Integer> inter = new HashSet<Integer>(a1);
		inter.retainAll(a2);
		System.out.println(inter);
		
		Set<Integer> diff = new HashSet<Integer>(a1);
		diff.removeAll(a2);
		System.out.println(diff);
		
		
	}

}
