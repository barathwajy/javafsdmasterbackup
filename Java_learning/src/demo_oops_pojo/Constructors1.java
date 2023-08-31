package demo_oops_pojo;

class stud1
{
	int a;
	// anonymous constructor  can be just constructed {} without name 
	// also default constructor should have same name as class
	public stud1()
	{
		System.out.println("constructor class");
	}
	public stud1(int ...a)
	{
		System.out.println("constructor class -1 int");
	}
	public stud1(int a, int b)
	{
		System.out.println("constructor class -2 int");
	}
}
public class Constructors1 {
	
	public static void main(String[] args)
	{
		stud1 s1 = new stud1(10,20);
		//s1.display();
	}
	

}
