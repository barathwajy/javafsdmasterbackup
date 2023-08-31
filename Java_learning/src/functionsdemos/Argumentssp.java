package functionsdemos;

public class Argumentssp {
		
	// var args -
	public static void demo(int a1,int ...a)
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main (String[] args)
	{
		demo(9,10,40,1,1,1,1,1,1,1,1,1,1,1);
	}
}
