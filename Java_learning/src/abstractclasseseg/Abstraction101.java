package abstractclasseseg;


abstract class human
{
	private String name;
	public human(String name)
	{
		this.name = name;
	}
	public abstract void city();
	public String getName()
	{
		return name;
	}
	
}


class living extends human
{	
	public living(String name)
	{
		super(name);
	}
	
	@Override
	public void city()
	{
		System.out.println("living in India -"+" "+getName());
	}
}

public class Abstraction101 {
	public static void main(String[] args)
	{
		living l1 = new living("chennai");
		living l2 = new living("Madurai");
		l2.city();
		l1.city();
	}

}
