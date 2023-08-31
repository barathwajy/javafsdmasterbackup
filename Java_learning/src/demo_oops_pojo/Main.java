package demo_oops_pojo;

public class Main {
	
	public static void main(String[] args)
	{
		
		Student s1 = new Student(101,"ab");
		s1.setSno(10);
		System.out.println(s1.getName());
		System.out.println(s1.getSno());
		System.out.println(s1.getPhone());
		
		
	}

}
