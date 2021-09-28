import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class P12_SegmentedSieve
{
	static int n = 1000000;
	static boolean[] sieve = new boolean[n+1];
	static void createSieve()
	{
		for(int i=2; i*i<=n; i++)
		{
			if(sieve[i] == true)
			{
				for(int j = i * i; j<=n; j+=i)
				{
					sieve[j] = false;
				}

			}
		}
	}

	//Finding max 
	static int max(int start , int end)
	{
		if(start>= end)
			return start;
		else 
			return end;
	}

	//Generating Primes Till Sqrt r and put into data structure
	static ArrayList<Integer> generatePrime(int x)
	{
		this.x = Math.sqrt(x);
		ArrayList<Integer> ds = new ArrayList<>();
		for(int i = 2; i*i<=x; i++)
		{
			if(sieve[i] == true)
				ds.add(i);
		}
		return ds;	
	}

	//Main Method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		createSieve();

		while(t!=0)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();

			//Get all the prime till sqrt  of R
			ArrayList<Integer> primes = generatePrime(r);

			//Create Dummy array of size r-l+1 and fill with 1
			int[] dummy = new int[r-l+1];
			for(int i = 0; i<dummy.length; i++)
			{
				dummy[i] = 1;
			}

			//mark all multiples of prime in range

			for(Integer pr : primes)
			{
				int firstMultiple = (l/pr)*pr;
				if(firstMultiple< l)    firstMultiple += pr;
				for(int j = max(firstMultiple, pr*pr); j<=r; j += pr)
				{
					dummy[j-1] = 0;
				}
			}

			//Print all the primes in range l r
			for(int i = l; i<=r; i++)
			{
				if(dummy[i-l] == 1)
					System.out.print(i + " ");
			}
			System.out.println();

			t--;
		}
	}
}