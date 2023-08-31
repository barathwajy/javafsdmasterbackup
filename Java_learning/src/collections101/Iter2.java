package collections101;
import java.util.Arrays;
import java.util.List;

public class Iter2 {
	
	public static void mian(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.iterator().forEachRemaining(System.out::println);
		
		
	}
}
