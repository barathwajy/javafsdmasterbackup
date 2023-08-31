package object_oriented_programming_oops;


class outro
{
	int d1=30;
}

public class Localinner1 {
	public static void main(String args[])
	{
		
		outro o1 = new outro();
		if(o1.d1<=20)
		{
			class inner1
			{
				void display()
				{
					System.out.println("class inside the if");
				}
			}
			inner1 i1 = new inner1();
			i1.display();
		}
		else
			System.out.println("not inside da poda");
	}

}
