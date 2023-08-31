package encapsulation;


/*
 *  Cannot access private directly 
 *  Setters and Getters can access it
 *  And set it 
 * 
 */

public class Encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1 = new Emp1();
		e1.setName("abbb");
	//	e1.name= "a";         this will give error we cant access it directly 
		
		e1.num = 10;
		
	}

}
