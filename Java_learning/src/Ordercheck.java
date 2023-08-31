import java.util.*;

public class Ordercheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Integer ar[] = new Integer[a];
		Integer oarr[] = new Integer[a];
		
		for(int i=0; i<a;i++)
		{
			ar[i]=sc.nextInt();
			oarr[i]=ar[i];
		}
		
		
		Arrays.sort(ar);
		int count=0;
		for(int i =0; i<a;i++)
		{
			if (ar[i]!=oarr[i])
				count+=1;
			//System.out.println(ar[i]+" "+oarr[i]);
		}
		System.out.println(count);
	}

}
