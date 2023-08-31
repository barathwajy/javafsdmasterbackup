
public class Arrey1 {
	public static void main(String[] args)
	{
		int [] a1 = new int[9];
		int a2[] = {1,2,3,4,5,6};
		int n=10;
		int [] a3 = new int[n];
		a1[0]=90;
		a1[5]=7;
		for(int i:a1)
		{
			System.out.println(i);
		}
		int [][] a4=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a4[i][j]=n;
				n++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a4[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

			
	}

}
