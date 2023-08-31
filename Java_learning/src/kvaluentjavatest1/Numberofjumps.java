package kvaluentjavatest1;

public class Numberofjumps {
	public static void main(String args[])
	{
		/*
		//int [] arr = new int[5];
		
		int flag=0;
		int runner=0;
		int jumps=0;
		int curr=0;
		int cnt=0;
		int ran=arr.length;
		
		for(int i=0;i<arr.length;i++)
		{
			jumps=arr[i];
			if(jumps>1)
			{
				int maxel=0;
				for(int j=1;j<jumps;j++)
				{
					if(arr[j]>(arr.length-i))
					{
						flag=1;
						//cnt++;
					}
					else {
						if(maxel<arr[j])
						{
							maxel=arr[j];
							//cnt++;
						}
							
					}
				}
			
			}
			else {
				ran-=1;
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		 int runner=0;
		 int i=0;
		 int cnt=1;
		 
		 while(true)
		 {
		 runner=arr[i];
		 int maxel=0;
		 int jp=0;
		 if(i+arr[i]<arr.length)
		 {
		 	jp=i+arr[i];
		 }
		 else{
		 break;
		 }
		 for(int j=i; j<i+arr[i];j++)
		 {
		 	if(arr[j] > maxel)
		 	{
		 		maxel=arr[j];
		 	}
		 }
		 i+=maxel;
		 if(i>arr.length)
		 {
		 break;
		 }
		 cnt+=1;
		 
		 }
		 System.out.println(cnt);
		 
		 
		 
	
		
		/*
		while(true)
		{
			jumps=arr[runner];
			if(jumps>=arr.length)
			{
				System.out.println(cnt);
				flag=1;
			}
			else {
				for(int i=0;i<jumps;i++)
				{
					
				}
			}
			
		}
		/*
		if(flag==0)
		{
			System.out.print(-1);
		}
		*/

	}

}
