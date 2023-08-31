package demo_oops_pojo;


class copy
{
	private int num;
	copy(int num)
	{
		this.num =num;
	}
	copy(copy c1)
	{
		this.num = c1.num;
	}
	/*
	@Override
	public String toString() {
		return "copy [num=" + num + "]";
	}
	*/
	@Override
	public String toString() {
		return "copy [num=" + num + "]";
	}
	
	
	
}
public class Copyconstructor2 {
	public static void main(String[] args)
	{
		/*
		 * 
		stud2 s2 = new stud2("k",1);
		System.out.println(s2.name+s2.num);
		stud2 s4 = new stud2(s2);
		System.out.println(s4.name + s4.num);
		
		 */
		copy c1 = new copy(99);
		copy c2 = new copy(c1);
		System.out.println(c1);
		copy c3=c2;
		System.out.println(c3);
	}

}
