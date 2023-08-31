import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Buff {
	public static void main(String[] args) throws IOException
	{	
		/*
		FileReader f1 = new FileReader("D:\\Java FSD Class\\Java_learning\\src\\intro.txt");
		BufferedReader b1 = new BufferedReader(f1);
		char c1[] = new char[20];

		if(b1.markSupported())
		{
			System.out.println("yes1");
			b1.mark(10);
		}
		*/
		BufferedReader bb1 = new BufferedReader (new InputStreamReader(System.in));
		String e1 = bb1.readLine();
		System.out.println(e1);
		
//		String s1 = System.console().readLine();
	//	System.out.println(s1);
		
		int x = 90;
		System.out.printf("I am %d, old",x);
		
	}

}
