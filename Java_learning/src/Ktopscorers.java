import java.util.*;

public class Ktopscorers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer a[] = new Integer [n];

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		/*
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		*/
		Arrays.sort(a,Collections.reverseOrder());
		int summer=0;
		for(int i=0;i<k;i++)
		{
			summer+=a[i];
		}
		System.out.println(summer);
		
		}
}
