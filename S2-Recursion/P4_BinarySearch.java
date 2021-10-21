import java.util.Scanner;
public class P4_BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,4,68,8};
		int end = arr.length-1;
		boolean found = binarySearch(arr,0,end,344);
		if(found)
			System.out.print("Key Found");
		else
			System.out.print("Not Found");
	}

	static boolean binarySearch(int[] a,int low,int high,int key)
	{
		if(low>high)
			return false;
		int mid = (low+high)/2;
		if(key == a[mid])
			return true;
		else if(key<a[mid])
			return binarySearch(a,low,mid-1,key);
		else if(key>a[mid])
			return binarySearch(a,mid+1,high,key);
		return false;
		
	}
}