package demo_oops_pojo;

class stud{
	int a;
}
class Singleton
{
	public String name;
	private static Singleton sn=null;
	private Singleton()
	{
		name= "I am a singleton class";
		System.out.println(name);
	}
	public static synchronized Singleton getInstance()
	{
		if(sn==null)
			sn=new Singleton();
		return sn;
	}
}
public class Singletonclasses {
	public static void main(String args[])
	{
		/*
		 * 
		 * 
		// normal class each object new memory i.e, unique memory
		stud s1 = new stud();
		stud s2 = new stud();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		*
		*
		*/
		Singleton s11 = Singleton.getInstance();
		Singleton s22 = Singleton.getInstance();
		//System.out.println(s11.name);
		System.out.println(s11.hashCode());
		System.out.println(s22.hashCode());
		
		
		
		
	}

}
