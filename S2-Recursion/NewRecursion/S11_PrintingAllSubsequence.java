// printing all the subsequences 
// Time Complexity O(2^n)
// Space Complexity o(n)

import java.util.Scanner;
import java.util.ArrayList;

public class S11_PrintingAllSubsequence
{
	public static void main(String[] args)
	{
		int[] arr = {1,3,2};
		ArrayList<Integer> ds = new ArrayList<>();
		subSeq(arr,0,ds,arr.length);
	}


	public static void subSeq(int[] arr,int index,ArrayList<Integer> ds,int n)
	{
		if(index == n)
		{
			System.out.println(ds);
			return;
		}


		//pick logic
		ds.add(arr[index]);
		subSeq(arr, index+1, ds, n);
		ds.remove(ds.size()-1);


		//not pick logic
		subSeq(arr, index+1, ds, n);
	}
}