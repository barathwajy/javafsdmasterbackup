import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Rpg {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int level = sc.nextInt();
		int arr1k[] = new int[c];
		int arr2k[] = new int[c];
		int arr1s[] = new int[c];
		for(int i=0;i<c;i++)
		{
			arr1k[i]=sc.nextInt();
			arr1s[i]=arr1k[i];
			//System.out.println(out1+arr1s[i]);
		}
		int cnt=0;
		for(int i=0;i<c;i++)
		{
			arr2k[i]=sc.nextInt();
		}
		Arrays.sort(arr1s);
		
		for(int i:arr1s)
		{
			if(i<=level)
			{
			System.out.println(i);
			int index=-5;
			for(int k=0;k<c;k++)
			{
				if(i==arr1k[k])
					index = k;
			}
			if(index>=0)
			{
			//System.out.println(index);
			level=level+arr2k[index];
			cnt+=1;
			}
			}

		}
		/*
		Dictionary<Integer,Integer> dict = new Hashtable();
		
		for(int i=0;i<c;i++)
		{
			dict.put(arr1k[i],arr2k[i]);
		}
		
		System.out.println(dict);
		*/
		
		System.out.println(cnt);
		
	}

}
