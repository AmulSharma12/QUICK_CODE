import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

public class P7_KthPrime
{
	static int n = 86028121;
	static boolean[] sieve = new boolean[n+1];
	static ArrayList<Integer> ds = new ArrayList<Integer>();
	static void createSieve()
	{
		for(int i=2;i<=n;i++)
		{
			sieve[i] = true;
		}

		for(int i=2 ; i*i<=n; i++)
		{
			if(sieve[i] == true)
			{
				for(int j=i*i;j<=n;j+=i)
				{
					sieve[j] = false;
				}
			}
		}

		//Getting All The Primes In Data Structure
		for(int i=2;i<=n;i++)
		{
			if(sieve[i] == true)
			{
				ds.add(i);
			}
		}
	}



	// finding what should be the size of sieve of contains 5*1000000 primes
    // Make sure sieve should be of10^8 
	// static int limit = 5*1000000;
	// static int count = 0;
	// static int size = 0;
	
	// static void size()
	// {
	// 	for(int i = 2;;i++)
	// 	{
	// 		if(sieve[i] == true)
	// 			count++;
	// 		if(count == limit)
	// 		{
	// 			size = i;
	// 			break;
	// 		}

	// 	}
	// 	System.out.println(size);		//86028121
	// }



	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		createSieve();
		
		// Test cases
		int t = sc.nextInt();
		int k;
		for(int start = t ; start>0 ; start--)
		{
			//kth prime
			 k = sc.nextInt();
			System.out.print(ds.get(k-1) + " ");
		}

	}
}