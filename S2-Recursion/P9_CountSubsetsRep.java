import java.util.Scanner;
// Counting all the subsets whose sum(from the subsets) is equal to particular sum(given in question) repeatation allowed
// [1,2] sum = 2
// [1,1] [2]  totalSubsets is 2


// Logic
// if pick stay at same index which element picked so arr[index]<=sum 
// if not pick sum will unaffected
// if we check all index i.e n-1  means our base condition hit when arr.length hits


// sum of subsets to reach sum (given in question i.e target)
// if intially sum is 0   
// if pick  we will do   0,1,2   we reach to sum(given in question)
// it is same if we carry sum(given in question)  2,1,0  so it reaches base condition



public class P9_CountSubsetsRep
{
	public static void main(String[] args)
	{
		int[] a = {1,2};
		int sum = 2;

		int totalSubsets = countSubsetsRep(a,0,sum);
		System.out.println(totalSubsets);
	}	

	static int countSubsetsRep(int[] arr, int index, int sum)
	{
		// Base Condition Check
		if(index == arr.length)
		{
			if(sum == 0)
				return 1;
			else
				return 0;
		}


		//  Logic    
		int cntSubset1 = 0;
		if(arr[index] <= sum)
		{
			sum -= arr[index];
			 cntSubset1 = countSubsetsRep(arr,index,sum); 
			sum += arr[index];
		}

		int cntSubset2 = countSubsetsRep(arr,index+1,sum);

		return cntSubset1 + cntSubset2;

	}
}