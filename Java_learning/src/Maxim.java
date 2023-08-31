import java.util.*;

public class Maxim {

	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
			System.out.print(array[i]+" ");
			}
		
		ArrayList<Integer> arr = new ArrayList<>();	
		List<Integer> arr1 = new ArrayList<>();
		
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					for(int l=0;l<n;l++)
					{
						if(i>j && j>k && k>l )
						{
							int summer = array[i]-array[j]+array[k]-array[l];
							arr.add(summer);
						}
					}
				}
			}
		}
		
		System.out.println(Collections.max(arr));
		
	}
}
