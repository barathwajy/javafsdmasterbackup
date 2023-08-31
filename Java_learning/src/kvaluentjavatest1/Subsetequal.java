package kvaluentjavatest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsetequal {
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
			int flag=0;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			for(int i=0;i<a;i++)
			{
				arr.add(sc.nextInt());
			}
			
			for(int i=0;i<a-1;i++)
			{
				ArrayList<Integer> arr1 = new ArrayList<Integer>();
				ArrayList<Integer> arr2 = new ArrayList<Integer>();
				
				for(int j=i+1;j<a;j++)
				{	arr1.addAll(arr.subList(i, j));
					for(int i1:arr)
					{
						if(arr1.contains(i1))
						{
						//
						}
						else {
							arr2.add(i1);
						}
					}
					if(summer(arr1)==summer(arr2))
					{
						flag=1;
					}
					
				}
			}
			if(flag==1)
			{
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		}
}
