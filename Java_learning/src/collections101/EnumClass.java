package collections101;

enum color{
	red,
	black,
	blue;
}

class demo1
{
	color c2;
	demo1(color c2)
	{
		this.c2 =c2;
	}
	 
	public void disp()
	{
		
		switch(c2)
		{
			case blue:
				System.out.println("i am blue");
				break;
			case red:
				System.out.println("i am red");
				break;
			case black:
				System.out.println("i am black");
				break;
		}
	}
}
public class EnumClass {
	
	public static void main(String args[])
	{
		String a1 = "red";
		demo1 d2 = new demo1(color.valueOf(a1));
		d2.disp();
		//color c1 = null;
		
	}
}
