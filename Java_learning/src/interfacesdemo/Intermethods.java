package interfacesdemo;


/*
 * Strictfp - Strict floating point
 * 
 * 
 */

class sfp
{
	public strictfp float sum()
	{
		float a=10.67676768f,b=20.98897879f;
		float s1=a+b/134;
		return s1;
	}
}
public class Intermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sfp f1 = new sfp();
		System.out.println(f1.sum());
		
		
		
	}

}
