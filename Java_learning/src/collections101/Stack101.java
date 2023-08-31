package collections101;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack101 {
	public static void main(String args[])
	{
		
		List<Integer> stacklist;
		stacklist = new ArrayList<>();
		
		
		
		
		
		
		
		
		Stack<Object> a1 = new Stack<>();
		a1.push(1);
		a1.push(10);
		a1.push("hello");
		a1.add('a');
		a1.pop();
		System.out.println(a1.peek());
		System.out.println(a1);
		Object a2 = a1.clone();
		System.out.println(a2);
		a1.pop();
		System.out.println(a1);
		System.out.println(a2);
	}

}
