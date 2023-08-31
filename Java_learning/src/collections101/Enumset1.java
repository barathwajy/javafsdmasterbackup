package collections101;

import java.util.EnumSet;
enum enum1 {name, sno, dept, demo1, demo2, demo3, pd}

public class Enumset1 {
	
	public static void main (String args[])
	{
		EnumSet<enum1> s1, s2, s3,s4;
		s1 = EnumSet.of(enum1.name);
		s2 = EnumSet.complementOf(s1);
		s3 = EnumSet.allOf(enum1.class);
		s4 = EnumSet.range(enum1.sno,enum1.pd);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	

}
