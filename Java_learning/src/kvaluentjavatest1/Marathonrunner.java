package kvaluentjavatest1;

import java.util.Scanner;

public class Marathonrunner {

	public static void main(String args[])
	{
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter a starting distance (between 5km to 8km)");
	int ele;
	int a = sc.nextInt();
	ele=a;
	while(true)
	{

		if(ele>8 || ele<5)
		{
			System.out.println("Sorry, choose a starting distance (between 5km to 8km )");
			int b = sc.nextInt();
			ele = b;
		}
		else {
			ele  = a;
			break;
		}
		
}
	for(int i=ele;i>0;i--)
	{
		System.out.println("Distance to run: "+i);
		if(i==(ele-1))
		{
			System.out.println("Good Start Keep it up!");
		}
		if(i<3)
		{
			System.out.println("Almost there!");
		}
		
	}
	System.out.println("Done for the day!");
}
}
