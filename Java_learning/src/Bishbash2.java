import java.io.*;

class Bishbash2{
	static int s=0;
	static int c=0;
	static int combinationUtil(int arr[], int n, int r, int index,int data[], int i)
	{
		if (index == r)
		{
			for (int j=0; j<r; j++)
//System.out.print(data[j]+" ");
				s += data[j];
			if(s==12)
				c=c+1;
			s=0;
			return 0;
		}
		
		if (i >= n)
			return 0;
data[index] = arr[i];
combinationUtil(arr, n, r, index+1, data, i+1);
combinationUtil(arr, n, r, index, data, i+1);

return c;
}
static int printCombination(int arr[], int n, int r)
{
int data[]=new int[r];
int c1 = combinationUtil(arr, n, r, 0, data, 0);
return c1;
}
public static void main (String[] args) {
int arr[] = {2,3,4,5,6,7,8};
int r = 4;
int n = arr.length;
System.out.println(printCombination(arr, n, r));
}
}