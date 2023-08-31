package functionsdemos;

public class Nestedrecurivefunc {
		
		public static int fun1(int n) // 95 106 96 97 108 98 109 99 110 100
		{	System.out.println(n+" 1");
			if(n>100) // 95 >100 106 99
			return n-10; // 96 97 98 100
			
			System.out.println(n+" 2");
			return fun1(fun1(n+11)); // fun1(fun1(106)) // fun1(96) 107 97 109  111
		}
		public static void main(String args[])
		{
			int f = fun1(95);
			System.out.println(f); 
		}
}
