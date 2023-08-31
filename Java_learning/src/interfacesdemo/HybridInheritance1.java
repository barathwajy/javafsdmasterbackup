package interfacesdemo;


/*
 *
 *           PAR 
 *          /   \
 *       a11     b11
 *          \   /
 *            D
 *
 *
 */

interface par
{
	
}

interface a11 extends par
{
	void disp();
}


interface b11 extends par
{
	void disp();
}

class D implements a11,b11
{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
public class HybridInheritance1 {
	public static void main(String[] args)
	{
		
	}

}
