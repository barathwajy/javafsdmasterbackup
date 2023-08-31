package kt_test2_08_08_23;

import java.util.ArrayList;
import java.util.Scanner;

interface AdvancedArithmetic
{
	int divisor_sum(int n);
}

public class MyCalculator implements AdvancedArithmetic{
	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				arr.add(i);
			}
		}
		int sums = summer(arr);
		return sums;
	}
	
	int summer(ArrayList<Integer> arr)
	{
		int sums=0;
		for(int i=0;i<arr.size();i++)
		{	
			sums+=arr.get(i);
			
		}
		return sums;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		MyCalculator m = new MyCalculator();
		System.out.println(m.divisor_sum(a));
	}
	
	
}
