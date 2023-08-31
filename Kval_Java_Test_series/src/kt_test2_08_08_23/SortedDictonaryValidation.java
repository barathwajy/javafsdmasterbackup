package kt_test2_08_08_23;

import java.util.Arrays;
import java.util.Scanner;

public class SortedDictonaryValidation {
	
	/*
	 *    1st element's index in order
	 *    and check 2nd element contains substring(1stelementindex:len(n))
	 *    if true 
	 *    go to 2nd and check third
	 */
	static int Checker(String[] dict, String orders[],String order)
	{
		int flag=0;
		for(int i=0;i<orders.length-1;i++)
		{
			for(int j=i+1;j<dict.length;j++)
			{
				String runner[] = dict[i].split("");
				int runs = order.indexOf(runner[i]);
				String innerrunner[] = dict[j].split("");
				if(order.substring(runs, order.length()).contains(innerrunner[0]))
				{
					
				}
				else {
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		/*
		
		int runs=0;
		for(int i=0;i<dict.length;i++)
		{
			String runner[] = dict[i].split("");
			if(runner[i]==runner[i])
			for(int j=i+1;j<dict.length;j++)
			{
				
			}
		}
		*/
		if(flag==1)
			return 0;
		
		return 1;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] dict = new String[n];
		for(int i=0;i<n;i++)
		{
			dict[i] = sc.next();
		}
		String order = sc.next();
		
		String orders[] = order.split("");
		
		System.out.println(Checker(dict, orders,order));
	}

}
