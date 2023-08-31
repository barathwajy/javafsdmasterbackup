package collections101;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Iter4 {
	public static void main(String args[])
	{
		List<String> l1 = new ArrayList<String>();
		l1.add("chennai");
		l1.add("mumbai");
		l1.add("hyderbad");
		
		l1.forEach(new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}
			
				}
					
				);
		
	
	
	}

}
