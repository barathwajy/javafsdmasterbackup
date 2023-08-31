import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations2 {
	
	
public static <T> List<List<T>> generateCombinations(List<T> list, int r) {

List<List<T>> result = new ArrayList<>();

combination(result, list, new ArrayList<>(), 0, r);

return result;

}


public static <T> void combination(List<List<T>> result, List<T> list, List<T> temp, int start, int r) {

if (r == 0) {

result.add(new ArrayList<>(temp));

return;

}

 

for (int i = start; i <= list.size() - r; i++) {

	// list[i]
temp.add(list.get(i));

combination(result, list, temp, i + 1, r - 1);

temp.remove(temp.size() - 1);

}

}

public static void main(String args[])

{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int target = sc.nextInt();
	int start = sc.nextInt();
	int end = sc.nextInt();
	
    List<Integer> inputlist = new ArrayList<Integer>();
    for(int i=start;i<end;i++)
    {
    	inputlist.add(i);
    }

    int r=n;
    int count=0;
    List<List<Integer>> combinations = Combinations2.generateCombinations(inputlist, r);
    for(List<Integer> i : combinations)
    {
    	if(getSum(i)==target)
    		count+=1;
    }
    System.out.println("C: "+count);

}
public static int getSum(List<Integer> nums) {
    int sum = 0;
    for (int i: nums) {
        sum += i;
    }
    return sum;
}

    
}

