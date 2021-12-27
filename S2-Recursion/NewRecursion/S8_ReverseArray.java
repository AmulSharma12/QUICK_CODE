// reverse array using recursion 
// you can do as taking two pointer
// you can do as taking single pointer

import java.util.Scanner;
import java.util.Arrays;
public class S8_ReverseArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i<n; i++)
			arr[i] = sc.nextInt();


		// reverse(arr,0,n-1,arr.length);
		reverse1(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}



	//using single pointer
	public static void reverse1(int[] arr,int index , int n)
	{
		if(index >= n/2)
			return;


		swap(arr,index, n-index-1);
		reverse1(arr,index+1,n);
	}

	//using two pointer
	public static void reverse(int[] nums,int i, int j,int n)
	{
		if(i>=j)	return;

		swap(nums,i,j);
		reverse(nums,i+1,j-1, n);
	}



	public static void swap(int[] nums, int st, int end)
	{
		int temp = nums[st];
		nums[st] = nums[end];
		nums[end] = temp;
	}
}