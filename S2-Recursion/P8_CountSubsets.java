import java.util.Scanner;

// Counting all the subset whose sum is divisible by k
// [1,3,2]   k=2
// [1,3] [2] [1,3,2]   output should be 3 as it was 3 subsets

// HINT :  dont use global/Local variable count TRICK::-> in recursion you can return from base case itself
// if condition meets then  return 1 if not meet return 0 so it will be store in variable and  at the end will return 
// the sum of all the variable that maderecursion call it goes with empty and at the returnin time it will come with value


public class P8_CountSubsets
{
	public static void main(String[] args)
	{
		int[] a = {1,3,2};
		int sum = 0;
		int k = 2;
		int totalSubsets = countSubsets(a,0,sum,k) - 1;
		System.out.println("count of all subsets whose sum is divisible by  is " + totalSubsets);
		System.out.println("End Recursion: 0x81");
	}

	static int countSubsets(int[] arr, int index,int sum,int k)
	{
		// base condition
		if(index ==  arr.length)
		{
			if(sum%k == 0)
				return 1;
			else
				return 0;
		}


		// Logic
		sum += arr[index];
		int cntSubSet1 = countSubsets(arr,index+1,sum,k);


		// backtrack call  returning time first undo the changes should be made
		sum -= arr[index];
		int cntSubSet2 = countSubsets(arr,index+1,sum,k);

		return cntSubSet1+cntSubSet2;
		// empty set included so there is one extra subset so subtract it
	}
}