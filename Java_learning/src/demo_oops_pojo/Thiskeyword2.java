package demo_oops_pojo;

class thiss
{
	int a;
	int b;
	thiss(){
		a=20;
		b=20;
	}
	void disp(thiss t1)
	{
		System.out.println(t1.a);
		System.out.println(a);
		System.out.println(t1.b);
	}
	void get()
	{
		disp(this);
	}

}

public class Thiskeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiss t1 = new thiss();
		t1.get();
		

	}

}
