package testing_d;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * Value Source
 * Argument source
 * enum source
 * method source
 */
public class Parameterdemos {
	
	@ParameterizedTest (name="(index)-run the array from zero={0}")
	@ValueSource(ints= {9,7,6,9})
	
	public void assum(int args)
	{
		System.out.println(args);	
	}
	
	
	@ParameterizedTest (name="(index)-run the array from zero={0}")
	@ValueSource(strings= {"9","7","6","9"})
	
	public void assum1(String args)
	{
		System.out.println(args);	
	}

	
	enum name{a,b,c,d}
	@ParameterizedTest ()
	@EnumSource(name.class)
	public void assum2(name n1)
	{
		System.out.println(n1);	
	}
	
	private static String[] names()
	{
		return new String[] {"aa","bb","cc"};
		
	}
	@ParameterizedTest ()
	@MethodSource("names")
	public void assum3(String n2)
	{
		System.out.println(n2);	
	}
	
	private static Object[] obj()
	{
		return new Object[][] {
			{"arr","prr","vrr"},
			{"py","jar","cpp"},
			{"tp","js","css"}
			
			
		};
 	}
	@ParameterizedTest ()
	@MethodSource("obj")
	public void assum4(String n1,String n2)
	{
		System.out.println("val-1: "+n1+" val-2: "+n2);	
		
	}
	
	
	
}
