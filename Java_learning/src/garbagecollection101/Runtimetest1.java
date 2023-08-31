package garbagecollection101;

public class Runtimetest1 {

	public static void main(String args[])
	{
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		
		for(int i=0;i<10000;i++)
		{
			new Runtimetest1();
		}
		System.out.println(r1.freeMemory());
		System.gc();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());
		
	}
}
