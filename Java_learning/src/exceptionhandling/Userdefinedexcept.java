package exceptionhandling;
class user extends Exception
{

	public user(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}

public class Userdefinedexcept {
	
	public static void main(String args[]) {

		try {
			throw new user("I have created this exception");
		}
		catch(user u)
		{
			System.out.println(u);
			u.printStackTrace();
		}
		
	}
	
}
