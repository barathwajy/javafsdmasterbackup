import java.util.ArrayList;

public class Mysterykey {
	static int count;
	static ArrayList<Integer> primeCal(int n)
	{
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       arrl.add(j);     
		}
		return arrl;
	}
	
	public static void main(String args[])
	{
		int N =5;
		System.out.print(N/2);
		
		primeCal(N);
		
		
		//for(int i=2; i<=N; i++)
		//{
			
		//}
	}
}
