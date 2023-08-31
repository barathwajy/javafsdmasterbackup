import java.util.Calendar;
import java.util.Date;

public class DateandTimejava {
	
	public static void main(String args[])
	{
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(234567890);
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date(123,8,15);
		System.out.println(d3);
		
		boolean a1 = d3.before(d1);
		int a2 = d3.compareTo(d1);
		Calendar c1 = Calendar.getInstance();
		//c1.set(1, 11);
		
		c1.set(Calendar.MONTH, 11);
		c1.set(Calendar.YEAR, 11);
		c1.set(Calendar.DATE, 2000);
		System.out.println(c1);
		System.out.println(c1.getTime());
		d1.setTime(10000);
		System.out.println(d1);
		//c1.setTime(10000);
		
	}

}
