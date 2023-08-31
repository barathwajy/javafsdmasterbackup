package demo_oops_pojo;



class stud2
{
	String name;
	int num;
	stud2(String na, int n)
	{
		this.name = na;
		this.num = n;
	}
	
	stud2(stud2 s3)
	{
		this.name = s3.name;
		this.num = s3.num;
	}


}
public class Copyconstructor1 {
	
	public static void main(String[] args)
	{
		stud2 s2 = new stud2("k",1);
		System.out.println(s2.name+s2.num);
		stud2 s4 = new stud2(s2);
		System.out.println(s4.name + s4.num);
		
	}
}
