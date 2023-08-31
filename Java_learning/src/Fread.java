import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fread {

	public static void main(String[] args) throws IOException
	{	
		FileReader f1 = new FileReader("D:\\Java FSD Class\\Java_learning\\src\\intro.txt");
		int i;
		while((i=f1.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		
		FileWriter w1 = new FileWriter("D:\\Java FSD Class\\Java_learning\\src\\intro.txt");
		BufferedWriter b1 = new BufferedWriter(w1);
		
		
		
		b1.write("Good");
		b1.close();
		f1.close();
	}
}
