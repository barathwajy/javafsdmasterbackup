package kvaluentjavatest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lexicographysort {
/*
	static String[] lexisort(String a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
			if(a[j-1].compareTo(a[j])>0)
			{
				String temp = a[j-1];
				a[j-1]= a[j];
				a[j] = temp;

			}
			}
		}
		return a;
	}
*/
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		int n = 8;
		ArrayList<String> a = new ArrayList<String>(n);
		//String skip = sc.next();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextLine());
		}
		a.sort(null);
		//lexisort(a);
		System.out.println(a);
	}
	
	

}
