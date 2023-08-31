package collections101;

import java.util.ArrayList;

public class Lambdaexp {
	
	// One Interface one Lambda i.e, not more than one parameterized value
	
 	interface f1
	{
		int op(int a, int b);
		//void obp(int a, int b, int c);
	}
	
	private int operation(int a, int b,f1 f) {
		return f.op(a,b);
	}
	public static void main(String args[])
	{
		
		Lambdaexp l1 = new Lambdaexp(); 
		f1 a = (int x, int y) -> x*y;
		System.out.println(l1.operation(2,3,a));
		
		
		
		
		
		
		
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		
		a1.forEach(n -> System.out.println(n));
		a1.forEach(n->{
			
			if(n%2==0)
				System.out.println(n);
		});
	}

}
