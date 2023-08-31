package leetcode_practice;

import java.util.*;

public class SplitStringsbySeparator {
	public static void main(String[] args)
	{
		char separator ='.';
		
		List<String> arr = new ArrayList<String>(Arrays.asList("one.two.three","four.five","six"));

		List<String> arr1 = new ArrayList<String>();
		for(String i: arr)
        {
			
			System.out.println(i);
			String sep = String.valueOf(separator);
            String[] arrstr = i.split(sep);
            System.out.println(Arrays.toString(arrstr));
            
            for(int j=0;j<arrstr.length;j++)
            {
            	System.out.println(arrstr[j]);
            	
            }
            
           for(String g :arrstr)
            {
                arr1.add(g);
            }
            
            
        }

        System.out.println(arr1);
	}

}
