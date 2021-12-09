import java.util.Scanner;
import java.util.ArrayList;

// Printing all the subsets/subsequences
// [1,3,2]
// [1][2][3][1,2][1,3][2,3][1,2,3][]

// for n = 3 we have all 8 subsets

public class P6_PrintingSubsets
{
	public static void main(String[] args)
	{
		int[] a = {0};
		ArrayList<Integer> ods = new ArrayList<>(a.length);
		subSequences(a,0,ods);	 
		System.out.println("Finished");
	}

	static void subSequences(int[] arr, int index, ArrayList<Integer> ds)
	{
		if(index == arr.length)
		{
			System.out.println(ds); 
			return;
		}

		ds.add(arr[index]);
		subSequences(arr,index+1,ds);
		ds.remove(ds.size()-1);
		subSequences(arr,index+1,ds);
	}
}