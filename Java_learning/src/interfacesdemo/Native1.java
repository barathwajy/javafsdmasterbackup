package interfacesdemo;

public class Native1 {

	public native int sqt(int i);
	public static void main(String[] args)
	{
		System.loadLibrary("Native1");
		System.out.println(new Native1().sqt(2));
	}
}
