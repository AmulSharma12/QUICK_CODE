// printing the single subsequence whose sum is k
// from base case return true if condition satisfied otherwise false
// and from  where function call enclosed in if and when it is satisfied return true
// to avoid the further recursion call


import java.util.Scanner;
import java.util.ArrayList;
public class S13_PrintSingle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,1};
		int sum = 2;
		ArrayList<Integer> ds = new ArrayList<>();
		//calling the function fromt main function
		printSingle(0, ds, 0, sum,arr, arr.length);

	}


	public static boolean printSingle(int index, ArrayList<Integer> ds, int s , int sum ,int[] arr, int n)
	{
		if(index == n)
		{
			if(s == sum)
			{
				System.out.println(ds);
				return true;
			}
			return false;
		}


		//will pick the element 
		s += arr[index];
		ds.add(arr[index]);
		if(printSingle(index+1,ds,s,sum,arr,n))
			return true;
		ds.remove (ds.size()-1);
		s -= arr[index];


		if(printSingle(index+1, ds, s, sum, arr, n))
			return true;

		return false;
	}
}