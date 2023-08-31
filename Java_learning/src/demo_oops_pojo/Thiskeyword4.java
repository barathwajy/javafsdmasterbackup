package demo_oops_pojo;
class A
{
	B b1;
	A(B b1){
		this.b1 =b1;
		b1.disp();
	}
}
class B
{
	int x=5;
	B()
	{
		// parameterized constructor - B(A(obj- current data in B)) 
		A o1 = new A(this);
	}
	void disp()

{
		System.out.println(x);
}
}
public class Thiskeyword4 {
	public static void main(String[] args)
	{
		B b2 = new B();
	}

}
