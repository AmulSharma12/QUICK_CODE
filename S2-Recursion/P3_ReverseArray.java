 import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class P3_ReverseArray
{

	public static void main(String[] args)
	{
		int[] arr = {2,2,5,6,88,0};
		 reverse(arr,0);
		System.out.print(Arrays.toString(arr));
	}

	static int[] reverse(int[] a, int start)
	{
		int n = a.length;
		if(start>=n/2)
			return a;

		swap(a,start,n-start-1);
		int[] result = reverse(a,start+1);
		return result;

	}

	static void swap(int[] k,int i, int j)
	{
		int temp = k[i];
		k[i] = k[j];
		k[j] = temp;
	}
}