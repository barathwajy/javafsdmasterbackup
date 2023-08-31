package functionsdemos;

public class Functions1 {

		// Argument 
		public static int demo(int a)
		{
			return(a*2);
		}
		
		
		public static int demo1()
		{	int a =10;
			return(a*2);
		}
		
		// This is called as overloading
		// where more than one method of sametype
		// runs based on different arguments
		
		public static int demo(float a)
		{
			return (int) (a*2);
		}
		
		
		
		public static void main(String[] args)
		{
			System.out.println(demo(10));
			System.out.println(demo1());
			
		}
}
