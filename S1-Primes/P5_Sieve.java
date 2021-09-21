import java.lang.*;
import java.util.Scanner;

class P5_Sieve{
	static int n = 1000000;
	static boolean[] isPrime = new boolean[n+1];

	static void createSieve()
	{
		for(int i=2;i<=n;i++)
		{
			isPrime[i] = true;
		}

		for(int i=2;i<=n;i++)
		{
			if(isPrime[i] == true)
			{
				for(int j=2*i ;j<=n; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		//O(nlog(logn))
		createSieve();

		for(int start = t ; start>0 ; start-- )
		{
			n = sc.nextInt();
			if(isPrime[n] == true)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}

	}
}