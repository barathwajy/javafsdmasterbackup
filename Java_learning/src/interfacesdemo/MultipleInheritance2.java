package interfacesdemo;

interface inter1
{
	void show1();
}

interface inter2
{
	void show2();
}

interface inter3 extends inter1,inter2
{
	void show3();
}

class inter4 implements inter3
{

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("show-1");
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("show-2");
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("show-3");
	}
	
}
public class MultipleInheritance2 {
	
	public static void main(String args[])
	{
		inter2 i2 = new inter4();
		i2.show2();
		
		inter3 i3 = new inter4();
		i3.show1();
		i3.show2();
		i3.show3();
		
	}

}
