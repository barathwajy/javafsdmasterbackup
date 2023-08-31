package abstractclasseseg;


abstract class out
{
	abstract void outer();
	abstract class inn
	{
		abstract void inner();
	}
}


class out1 extends out
{
	class inn1 extends inn
	{

		@Override
		void inner() {
			System.out.println("I am a abst of inner class");
			
		}
		
	}

	@Override
	void outer() {
		System.out.println("I am a abst of outer");
		
	}
}

public class NestedAbstractClasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out1 o1 = new out1();
		out1.inn1 i1 = o1.new inn1();
		
		o1.outer();
		i1.inner();
	}

}
