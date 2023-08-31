package java_learning_strings;
import java.util.StringTokenizer;

public class Stoken {
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("welcome:to:java:class",":",true);
		StringTokenizer st1 = new StringTokenizer("welcome:to:java:class",":");
		
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
			
		}
		System.out.println("   ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			
		}
		
	}

}
