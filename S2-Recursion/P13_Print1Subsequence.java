import java.util.Scanner;
import java.util.ArrayList;

// Print only single subsequence in an array whose sum is divisible by k
// you when hit base case returns true otherwise false
// and from base case you recieved true you also return with true value 
// otherwise resume to the next instruction

public class P13_Print1Subsequence
{
	public static void main(String[] args)
	{
		int[] array ={2,3,6};
		int k = 3;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		singleSubsequence(array,0,sum,list,k);
		System.out.println("End Recursion: ");

	}

	static boolean singleSubsequence(int[] arr, int index, int sum, ArrayList<Integer> ds,int k)
	{
		// base case when you checked for all the index  you stop at the length of array
		if(index == arr.length)
		{
			if(sum%k == 0  && ds.size()!=0)
			{
				System.out.println(ds);
				return true;
			}
			System.out.println(" Failed");
			return false;
		}

		// logic
		// pick call i.e. include in subsets
		ds.add(arr[index]);
		sum += arr[index];

		// if you found call return with true we will get subsets now we  will not resume nextline
		// return from here itself   singleSubsequence(arr,index+1,sum,ds,k);
		System.out.print("pick ");
		if(singleSubsequence(arr,index+1,sum,ds,k) == true)
			return true;
			System.out.print("pick back ");
		ds.remove(ds.size()-1);
		sum -= arr[index];

		// not pick call i.e. not include in subsets
		// if you found call return with true we will get subsets now we  will not resume nextline
		// return from here itself   singleSubsequence(arr,index+1,sum,ds,k);
		System.out.print("not pick ");
		if(singleSubsequence(arr,index+1,sum,ds,k) == true)
			return true;
		System.out.print("not pick back ");
		return false;
	}
}