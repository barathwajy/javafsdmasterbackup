package abself;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Arraylist101 {
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.contains(5));
		list.addAll(list);
		System.out.println(list);
		list.set(2, 5);
		System.out.println(list);
		
		
		// 2D ArrayList
		
		ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			//Initializing to have arraylist inside arraylist and mentioning how many 
			list2d.add(new ArrayList<>());
		}
	
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				list2d.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list2d);
		System.out.println(list.get(0));
		Collections.sort(list);
		int sizeoflist = list.size();
		
		
		
	}

}
