// printing all the subsequences whose sum is k
// you will have to print for those you  have to take ds
//you have to check the element whether it equal to sum or not
import java.util.Scanner;
import java.util.ArrayList;
public class S12_SumisK
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,1};
		int sum = 2;
		ArrayList<Integer> ds = new ArrayList<>();
		sumK(0, ds , 0, sum, arr, arr.length);

	}


	public static void sumK(int index, ArrayList<Integer> ds , int s, int sum, int[] arr, int n)
	{
		if(index == n)
		{
			if(s == sum)
				System.out.println(ds);
			return;
		}


		s += arr[index];
		ds.add(arr[index]);
		sumK(index+1, ds, s, sum, arr, n);
		s -= arr[index];
		ds.remove(ds.size()-1);

		sumK(index+1,ds, s, sum, arr, n);
	}
}