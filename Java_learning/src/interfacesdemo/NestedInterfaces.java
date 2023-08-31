package interfacesdemo;


interface inter11
{
	void msg();
	interface inter12
	{
		void msg1();
	}
	interface inter13
	{
		void msg2();
	}
}

class int1
{
	interface as1
	{
		void msg();
	}

	
}
interface ad1
{
	class der1
	{
		void sip()
		{
			System.out.println("hello");
		}
	}
}
/*
 * 
 // Methods could only be used within a interfaces not directly accessible
 // through 

 * 
 	public class NestedInterfaces implements inter11{
	public static void main(String args[])
	{
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}


}


// *****************************************************************************************************************  //
public class NestedInterfaces implements inter11.inter13{
	public static void main(String args[])
	{
		
	}

	@Override
	public void msg2() {
		// TODO Auto-generated method stub
		
	}


}

// *****************************************************************************************************************  //
 
public class NestedInterfaces implements int1.as1{
	public static void main(String args[])
	{
		
	}

	public void msg() {
		// TODO Auto-generated method stub
		
	}


}
// *****************************************************************************************************************  //
 

 *
 */
public class NestedInterfaces extends ad1.der1{
	public static void main(String args[])
	{
		
	}


}
