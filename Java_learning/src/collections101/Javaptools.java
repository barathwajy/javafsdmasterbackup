package collections101;

import java.util.OptionalLong;

public class Javaptools {
	
	public static void main(String args[])
	{
		OptionalLong op1 = OptionalLong.empty();
		op1.ifPresentOrElse((value)
				-> {System.out.println(value);}, 
				()->System.out.println("empty"));;
	}
}
