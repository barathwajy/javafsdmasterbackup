package functionsdemos;

public class Circularrecursivefuc {
	
	
	public static void f1(int n)
	{
		if(n>0) {
			System.out.println(n+" ");
		f2(n-1);
		}
	}
	
	public static void f2(int n)
	{
		if(n>1)
		{
			System.out.println(n+" ");
			f1(n/2);
		}

	}
	
	public static void main(String args[])
	{
		f1(21);
	}
	

}
