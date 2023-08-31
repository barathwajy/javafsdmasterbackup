package kvaluentjavatest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Profitandlosses {
	
static int summer(List<Integer> list)
{
	int summers = 0;
	for(int i :list)
	{
		summers+=i;
	}
	
	return summers; 
}

 public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
			
		}
		
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				//System.out.println(arr.subList(i, j));
				int sums = summer(arr.subList(i, j));
				arr1.add(sums);
			}
		}
	
		System.out.println(Collections.max(arr1));
		arr1.sort(null);
		System.out.println(arr1);
		//System.out.println(arr1);
	}
}
