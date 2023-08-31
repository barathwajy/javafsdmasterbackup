import java.util.*;

public class Lareve1swap {
	public static void main(String main[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char [] b = a.toCharArray();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		
		
		for(int i = 0; i<a.length();i++)
		{
			for(int j=i+1; j<a.length();j++)
			{
				StringBuilder str = new StringBuilder(a);				
			
				char c = str.charAt(i);
				System.out.println(c+ " " +str.charAt(j));
				str.setCharAt(i,str.charAt(j));				
				str.setCharAt(j, c);
				String mystr = str.toString();
				
				if(Integer.valueOf(mystr)%2==0)
					arr.add(Integer.valueOf(mystr));
				
			}
		}
		
		System.out.println(Collections.max(arr));
		
		
    }
	
}

