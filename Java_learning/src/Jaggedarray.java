
public class Jaggedarray {

	public static void main (String args[])
	{
		int a[][] = new int [][]{
				new int[] {1,2,2,3,3,4},
				new int[] {2,3},
				new int[] {33,3,3,3,3,3,3,3,3,3,3,3,3,}
 					};
		
		int  a1[][] = {
				new int[] {1,2,2,3,3,4},
				new int[] {2,3},
				new int[] {33,3,3,3,3,3,3,3,3,3,3,3,3,}
 					};
		
		int a2[][] = {
				{1,2,2,3,3,3},
				{4,4,4,4,4,4,4,4,4,4,4,4},
				{4,5,6,6,7,8,9,9,1,01,10,1110}
					};
		
		
		int al[][] = new int[2][];
		al[0]=new int[4];
		al[1]=new int[5];
		
		int c = 0;
		
		for(int i=0; i<al.length;i++)
		{
			// Here we are getting the length of the array as such 
			//defined in the front and adding values till the defined value
			
			for(int j=0; j<al[i].length;j++)
			{
				al[i][j]=c++;
			}
		}
		
		for(int i=0; i<al.length;i++)
		{
			for(int j=0; j<al[i].length;j++)
			{
				System.out.print(al[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
