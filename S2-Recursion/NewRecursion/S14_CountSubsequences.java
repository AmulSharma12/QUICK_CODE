// counting the subsequence whose sum is k
// for counting the subsequence in base case you should have to return 1 or 0
// if condition satisfied return 1 otherwise 0


public class S14_CountSubsequences
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,1};
		int sum = 2;
		
		//calling the function fromt main function
		int result = countSubsets(0, 0, sum,arr, arr.length);
		System.out.println(result);
	}


	public static int countSubsets(int index, int s, int sum,int[] arr, int n)
	{
		if(index == n)
		{
			if(s == sum)
				return 1;

			return 0;
		}

		s += arr[index];
		int l = countSubsets(index+1, s, sum, arr, n);
		s -= arr[index];


		int r = countSubsets(index+1, s, sum, arr,n);


		return l + r;
	}
}