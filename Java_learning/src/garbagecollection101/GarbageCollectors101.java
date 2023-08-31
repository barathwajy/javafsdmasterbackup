package garbagecollection101;



class emp
{
	private static int id=0;
	String name;
	int phone;
	public emp(String name,int phone)
	{
		super();
		this.id = id+1;
		this.name = name;
		this.phone = phone;
	}
	void display()
	{
		System.out.println("name= "+name);
	}
	void display1()
	{
		System.out.println(id);
	}
	protected void finalize()
	{
		--id;
	}
}

public class GarbageCollectors101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1 = new emp("a",1223);
		emp e2 = new emp("b",1224);
		//emp e3 = new emp("c",1225);
		e1.display();
		e2.display();
		e1.display1();
		e2.display1();
		
		emp x = new emp("a",12);
		emp y = new emp("a",12);
		x.display();
		y.display();
		x.display1();
		y.display1();
		
		x=y=null;
		System.gc();
		System.runFinalization();
		e1.display1();
		//x.display1();
		
		
	}

}
