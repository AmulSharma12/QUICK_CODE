import java.util.Scanner;
import java.util.ArrayList;

// Printing all the subsets whose sum is divisble by k
// [1,3,2] 			k = 2
// [1,3]       sum = 4    4%2 = 0
// []		   sum = 0    0%2 = 0


public class P7_PrintingSubsetsSumModk
{
	 public static void main(String[] args)
	 {
	 	int[] a = {1,3,2};
	 	ArrayList<Integer> list = new ArrayList<Integer>();
	 	int k = 2;
	 	int s = 0;

	 	// calling method subSequenceSumModK
	 	subSetSmk(a,0,s,list,k);
	 	System.out.println("End");

	 }

	 static void subSetSmk(int[] arr, int index, int sum, ArrayList<Integer> ds, int k)
	 {
	 	// Base Case
	 	 if(index == arr.length)
	 	 {
	 	 	if(ds.size() != 0  &&  sum%k == 0)
	 	 	{
	 	 		System.out.println(ds);
	 	 	}
	 	 	return;
	 	 }

	 	 // Logic
	 	 ds.add(arr[index]);
	 	 sum += arr[index];
		 subSetSmk(arr,index+1,sum,ds,k);

	 	 // after returning undo the changes we made for go to non pick call is backtrack call
	 	 ds.remove(ds.size()-1);
	 	 sum -= arr[index];
	 	 subSetSmk(arr,index+1,sum,ds,k);
	 }
}