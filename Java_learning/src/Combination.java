import java.io.*;
import java.util.*;

class Combination {
	
	static int[] arrb;
	static void combinationUtil(int arr[], int data[], int start, int end, int index, int r)
	{
		if (index == r)
		{	
			
			arrb = data;
			List al = Arrays.asList(arrb);
			//for (int j=0; j<r; j++)
			//	System.out.print(arrb[j]+" ");
			//System.out.println("");
			System.out.println(al);

			return;
		}
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
		
	}
	//static List al = Arrays.asList(arrb);
	

	static void printCombination(int arr[], int n, int r)
	{
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r);
	}

	public static void main (String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int r = 3;
		int n = arr.length;
		printCombination(arr, n, r);
		//System.out.println(al); 
	}
}

