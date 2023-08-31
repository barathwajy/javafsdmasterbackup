package kt_test2_08_08_23;

import java.util.ArrayList;
import java.util.Collections;

interface menuItem{
	double menuItems_prices();
	String menuItems_names();
	
}

class Sandwich implements menuItem
{
	@Override
	public double menuItems_prices() {
		// TODO Auto-generated method stub
		
		Double price = 2.75;
		return price;
	}
	@Override
	public String menuItems_names() {
		// TODO Auto-generated method stub
		String name = "Sandwich";
		return name;
	}
	
}
class Salad implements menuItem
{

	@Override
	public double menuItems_prices() {
		// TODO Auto-generated method stub
		
		Double price = 1.15;
		return price;
	}

	@Override
	public String menuItems_names() {
		// TODO Auto-generated method stub
		String name = "Salad";
		return name;
	}
	
}
class Drink implements menuItem
{

	@Override
	public double menuItems_prices() {
		// TODO Auto-generated method stub
		
		Double price = 1.25;
		return price;
	}

	@Override
	public String menuItems_names() {
		// TODO Auto-generated method stub
		String name = "Drink";
		return name;

	}
	
}
public class Trio implements menuItem
{
	public static void main(String args[])
	{
		Trio t = new Trio();
		System.out.println(t.menuItems_names());
		System.out.println(t.menuItems_prices());
	}

	@Override
	public double menuItems_prices() {
		// TODO Auto-generated method stub
		ArrayList<Double> arr = new ArrayList<Double>();
		Sandwich sd1 = new Sandwich();
		Salad s1 = new Salad();
		Drink d1 = new Drink();
		arr.add(sd1.menuItems_prices());
		arr.add(s1.menuItems_prices());
		arr.add(d1.menuItems_prices());
		double total_price = (sd1.menuItems_prices()+s1.menuItems_prices()+d1.menuItems_prices())-(Collections.min(arr));
		return total_price;
	}

	@Override
	public String menuItems_names() {
		Sandwich sd1 = new Sandwich();
		Salad s1 = new Salad();
		Drink d1 = new Drink();
		
		
		return sd1.menuItems_names()+" / "+s1.menuItems_names()+" / "+ d1.menuItems_names();
		
	}
	
}
