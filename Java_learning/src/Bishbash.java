import java.util.*;

public class Bishbash {
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		ArrayList<Integer> tempaar = new ArrayList<Integer>();

		for(int i=a; i<b;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				System.out.println(i+" "+j);
				
			}
			
		}		
		
		
		
	}
}
