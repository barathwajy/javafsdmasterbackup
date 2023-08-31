package abself;

import java.util.Arrays;

public class Swap_reverse_array {
	
		public static void main(String args[])
		{
			int[] arr = {1,2,3,4,5,6,7,8,9};
			System.out.println(Arrays.toString(arr));
			reverse(arr);
			System.out.println(Arrays.toString(arr));
		}
		
		
		// Two pointer method reverse where 
		// Start and End are swapped until start > end 
		static void reverse(int[] arr)
		{
			int start = 0;
			int end = arr.length-1;
			while(start<end)
			{
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		public static void swap(int[] arr, int a, int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
}
