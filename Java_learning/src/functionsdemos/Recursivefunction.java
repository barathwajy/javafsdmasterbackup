package functionsdemos;

public class Recursivefunction {
	
		/*
		public static void fun1()
		{
			int a=0;
			System.out.println("Eg recur");
			if(a>=5)
			{
				return;
			}
			else {
			a++;
			fun1();
			}
		}
		public static void main(String args[])
		{
			fun1();
			
		}
		*/
	    
//****************************** TAIL RECURSION ****************************************************** 
/*		public static void f1(int n) {
			if(n>0)
			{
				System.out.println(n);
				f1(n-1);
			}
		}
		
		public static void main(String[] args)
		{
			int a=5;
			f1(a);
		}
*/
// Output 5 4 3 2 1
		
//****************************** TAIL RECURSION ******************************************************		
	
//****************************** Head  RECURSION ****************************************************** 
/*				public static void f1(int n) {
					if(n>0)
					{
						f1(n-1);
						System.out.println(n);
						
					}
				}
				
				public static void main(String[] args)
				{
					int a=5;
					f1(a);
				}
				
// Output 1 2 3 4 5 ( It keeps the elements in the stack and prints atlast.
*/
//****************************** Head RECURSION ******************************************************		
			
	
//****************************** Tree  RECURSION ****************************************************** 
	
				public static void f1(int n) {
						if(n>0)
						{
							System.out.print(n+" ");
							f1(n-1); 
							System.out.println();
							f1(n-1);
							
							
						}
					}
					
					public static void main(String[] args)
					{
						int a=3;
						f1(a);
					}
	
					
// Output (Iterative method - multi-threaded | focuses on running function1 first and the next functions goes to a stack 
// similar to that of 
// 3 2 1
// 1
// 2 1 
// 1 

//****************************** Tree RECURSION ******************************************************		
				



}
